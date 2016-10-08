$(function() {
    var api = {
        init: function() {
            this
        },
        call: function() {
            
        }
    };
    var getAllPersons = function() {
        $.getJSON('api/person/all', function(persons) {
            $('#person-table').find('tr:gt(0)').remove(); // clear existing persons from table before appending
            $.each(persons, function(i, person) {
                addPersonToTable(person);
            });
        });
    };
    
    var getAllCompanies = function() {
        $.getJSON('api/company/all', function(companies) {
            $('#company-table').find('tr:gt(0)').remove(); // clear existing companies from table before appending
            $.each(companies, function(i, company) {
                addCompanyToTable(company);
            });
        });
    };
    
    var addPersonToTable = function(person) {
        var hobbiesArray = [];
        $.each(person.hobbies, function(i, hobby) {
            hobbiesArray.push(hobby.name);
        });
        var hobbies = (hobbiesArray.length > 0 ? hobbies.join() : 'No hobbies'); // if the person has hobbies, concatenate by comma
        
        $('#person-table').append(
            '<tr>' +
            '<td>' + person.firstName + '</td>' +
            '<td>' + person.lastName + '</td>' +
            '<td>' + hobbies + '</td>' +
            '<td class="text-right"><div class="edit_person glyphicon glyphicon-pencil"></div> <div class="remove_person glyphicon glyphicon-remove"></div></td>' +
            '</tr>'
        );
    };
    
    var addCompanyToTable = function(company) {
        $('#company-table').append(
            '<tr>' +
            '<td>' + company.name + '</td>' +
            '<td>' + company.description + '</td>' +
            '<td>' + company.cvr + '</td>' +
            '<td>' + company.NumEmployees + '</td>' +
            '<td>' + company.marketValue + '</td>' +
            '<td class="text-right"><div class="edit_company glyphicon glyphicon-pencil"></div> <div class="remove_company glyphicon glyphicon-remove"></div></td>' +
            '</tr>'
        );
    };
});