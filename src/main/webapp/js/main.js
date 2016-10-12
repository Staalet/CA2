$(function() {
    var getAllPersons = function() {
        $.getJSON('api/person/all', function(persons) {
            $('#personTable').find('tr:gt(0)').remove();
            $.each(persons, function(i, person) {
                addPersonToTable(person);
            });
        });
    };
    
    var getAllCompanies = function() {
        $.getJSON('api/company/all', function(companies) {
            $('#companyTable').find('tr:gt(0)').remove();
            $.each(companies, function(i, company) {
                addCompanyToTable(company);
            });
        });
    };
    
    var addPersonToTable = function(person) {
        $('#personTable').append(
            '<tr>' +
            '<td>' + person.firstName + '</td>' +
            '<td>' + person.lastName + '</td>' +
            '<td class="text-right"><div class="editPersonBtn glyphicon glyphicon-pencil"></div> <div class="deletePersonBtn glyphicon glyphicon-remove" data-person-id="' + person.id + '"></div></td>' +
            '</tr>'
        );
    };
    
    var addCompanyToTable = function(company) {
        $('#companyTable').append(
            '<tr>' +
            '<td>' + company.name + '</td>' +
            '<td>' + company.description + '</td>' +
            '<td>' + company.cvr + '</td>' +
            '<td>' + company.numEmployees + '</td>' +
            '<td>' + company.marketValue + '</td>' +
            '<td class="text-right"><div class="editCompanyBtn glyphicon glyphicon-pencil"></div> <div class="deleteCompanyBtn glyphicon glyphicon-remove" data-company-id="' + company.id + '"></div></td>' +
            '</tr>'
        );
    };
    
    var serializeFormToJSON = function(formElement) {
        var formData = $(formElement).serializeArray();
        var data = {};
        $(formData).each(function(i, obj) {
            data[obj.name] = obj.value;
        });
        return JSON.stringify(data);
    };
    
    $('form#addPerson').submit(function(event) {
        event.preventDefault();
        
        var form = $(this);
        var json = serializeFormToJSON(form);
        
        $.ajax({
            type: 'PUT',
            url: 'api/person/add',
            data: json,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function(person) {
                addPersonToTable(person);
            }
        });
    });
    
    $('form#editPerson').submit(function(event) {
        event.preventDefault();
        
        var form = $(this);
        var json = serializeFormToJSON(form);
        
        $.ajax({
            type: 'POST',
            url: 'api/person/edit',
            data: json,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function() {
                getAllPersons();
            }
        });
    });
    
    $('form#addCompany').submit(function(event) {
        event.preventDefault();
        
        var form = $(this);
        var json = serializeFormToJSON(form);
        
        $.ajax({
            type: 'PUT',
            url: 'api/company/add',
            data: json,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function(company) {
                addCompanyToTable(company);
            }
        });
    });
    
    $('form#editCompany').submit(function(event) {
        event.preventDefault();
        
        var form = $(this);
        var json = serializeFormToJSON(form);
        
        $.ajax({
            type: 'POST',
            url: 'api/company/edit',
            data: json,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function() {
                getAllCompanies();
            }
        });
    });
    
    $('#personTable').on('click', '.editPersonBtn', function() {
        var td = $(this).closest('tr').contents();
        
        var firstName = td.eq(0).html();
        var lastName = td.eq(1).html();
        
        $('form#editPerson input[name=firstName]').val(firstName);
        $('form#editPerson input[name=lastName]').val(lastName);
        $('form#editPerson').parent('div').removeClass('hidden');
    });
    
    $('.deletePersonBtn').click(function() {
        var personId = $(this).data('person-id');
        
        $.ajax({
            type: 'DELETE',
            url: 'api/person/delete/' + personId,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function() {
                getAllPersons();
            }
        });
    });
    
    $('#companyTable').on('click', '.editCompanyBtn', function() {
        var td = $(this).closest('tr').contents();
        
        var name = td.eq(0).html();
        var description = td.eq(1).html();
        var cvr = td.eq(2).html();
        var numEmployees = td.eq(3).html();
        var marketValue = td.eq(4).html();
        
        $('form#editCompany input[name=name]').val(name);
        $('form#editCompany input[name=description]').val(description);
        $('form#editCompany input[name=cvr]').val(cvr);
        $('form#editCompany input[name=numEmployees]').val(numEmployees);
        $('form#editCompany input[name=marketValue]').val(marketValue);
        $('form#editCompany').parent('div').removeClass('hidden');
    });
    
    $('.deleteCompanyBtn').click(function() {
        var companyId = $(this).data('company-id');
        
        $.ajax({
            type: 'DELETE',
            url: 'api/company/delete/' + companyId,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: function() {
                getAllCompanies();
            }
        });
    });
    
    getAllPersons();
    getAllCompanies();
});