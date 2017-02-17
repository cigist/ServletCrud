/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {
    $scope.tes2 = function () {
        console.log("Helllo");
    };

    $scope.users = [];
    $scope.userform = {
        userId: "",
        username: "",
        password: "",
        name: "",
        flagActive: ""
    };

    $scope.processUser = function ()
    {
        $http({
            method: 'POST',
            url: 'MstUserServlet',
            data: $scope.userform,
            headers: {
                'Content-Type': 'application/json'
            }
        }).success(function (data) {
            console.log(data);
        }).error(function (data) {
            console.log("Erorr Saved!");
        });
        console.log("Proccess Done!");
    };

    getUserDetails();

    function getUserDetails() {
        $http({
            method: "GET",
            url: "MstUserServlet?action=listuser"
        }).then(function mySucces(response) {
            $scope.person = response.data;
        }, function myError(response) {
            $scope.person = response.statusText;
        });
    }
    ;
    
     function getUserBy() {
        $http({
            method: "GET",
            url: "MstUserServlet?action=listby&userId=001"
        }).then(function mySucces(response) {
            $scope.person = response.data;
        }, function myError(response) {
            $scope.person = response.statusText;
        });
        
        console.log("xxx");
    }
    ;

    $scope.selectEdit = function (id) {
        var index = getSelectedIndex(id);
        var user = $scope.person[index];
        $scope.userId = user.id;
        
        console.log(user.id);

    };

    function getSelectedIndex(id) {
        for (var i = 0; i < $scope.person.length; i++)
            if ($scope.person[i].id == id)
                return i;
        return -1;
    };
    
    $scope.edit = function () {
        var index = getSelectedIndex($scope.userId);
    };

//    $scope.selectedRow = null;  // initialize our variable to null
//    $scope.setClickedRow = function (index) {  //function that sets the value of selectedRow to current index
//        $scope.selectedRow = index;
//        console.log(index);
//        $scope.userform.userId = index;
//
//    };

    function clearForm() {
        $scope.userform.name = "";
        $scope.userform.username = "";
        document.getElementById("userId").disabled = false;
    }
    ;

});

app.controller('myCtrl2', function ($scope, $http, $window) {

    $scope.tes = function () {
        console.log("Helllo");
    };

    $scope.name = "hello";

    $scope.inputName = name;
    $scope.popupGreet = function () {
        $window.swal('Congratulations!', "Hi there " + $scope.inputName, 'success');
    };
});