$(function() {
    /*
    var app = {
        self: this,
        api: {
            url: 'api/',
            call: function(method, url, data, callback) {
                $.ajax({
                    type: method,
                    url: url,
                    data: data,
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    },
                    success: callback
                });
            }
        },
        init: function() {
            
        },
        bindEvents: function() {
            $('form#addPerson').submit(this.handleEvents.person.add);
            $('form#editPerson').submit(this.handleEvents.person.edit);
            $('form#addCompany').submit(this.handleEvents.company.add);
            $('form#editCompany').submit(this.handleEvents.company.edit);
            
            $('.edit_person').click(this.handleEvents.company.edit);
            $('.delete_person').click(this.handleEvents.person.remove);
        },
        handleEvents: {
            person: {
                add: function() {
                    var data = 
                    this.api.call('PUT', 'person/add', 1);
                },
                edit: function() {
                    
                },
                remove: function() {
                    
                }
            },
            company: {
                add: function() {
                    
                },
                edit: function() {
                    
                },
                remove: function() {
                    
                }
            }
        },
        serializeForm: function(form) {
            var formData = $(form).serializeArray();
            var data = {};
            return $(formData).each(function(i, obj) {
                data[obj.name] = obj.value;
            });
        }
    };
    
    app.init();
    */
    
    var getAllPersons = function() {
        $.getJSON('api/person/all', function(persons) {
            $('#personTable').find('tr:gt(0)').remove(); // clear existing persons from table before appending
            $.each(persons, function(i, person) {
                addPersonToTable(person);
            });
        });
    };
    
    var getAllCompanies = function() {
        $.getJSON('api/company/all', function(companies) {
            $('#companyTable').find('tr:gt(0)').remove(); // clear existing companies from table before appending
            $.each(companies, function(i, company) {
                addCompanyToTable(company);
            });
        });
    };
    
    getAllPersons();
    getAllCompanies();
    
    var addPersonToTable = function(person) {
        $('#personTable').append(
            '<tr>' +
            '<td>' + person.firstName + '</td>' +
            '<td>' + person.lastName + '</td>' +
            '<td class="text-right"><div class="editPersonBtn glyphicon glyphicon-pencil"></div> <div class="deletePersonBtn glyphicon glyphicon-remove"></div></td>' +
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
            '<td class="text-right"><div class="editCompanyBtn glyphicon glyphicon-pencil"></div> <div class="deleteCompanyBtn glyphicon glyphicon-remove"></div></td>' +
            '</tr>'
        );
    };
    
    $('form#addPerson').submit(function(event) {
        event.preventDefault();
        
        var method = 'PUT';
        var url = 'person/add';
        var formData = $(this).serializeArray();
        var data = {};
        
        $(formData).each(function(i, obj) {
            data[obj.name] = obj.value;
        });
        
        $.ajax({
            type: method,
            url: 'api/' + url,
            data: data,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            success: addPersonToTable
        });
    });
});