'use strict';

/* Controllers */


function MyCtrl1() {}
MyCtrl1.$inject = [];


function MyCtrl2() {
}
MyCtrl2.$inject = [];

function AnalysesCtrl($scope){
    $scope.analyses = [];
}
AnalysesCtrl.$inject = ['$scope']
