sap.ui.define([
	"sap/ui/core/mvc/Controller",
	"sap/ui/model/json/JSONModel"
], function (Controller, JSONModel) {
	"use strict";

	return Controller.extend("sap.ui.demo.nav.controller.App", {

		onInit: function () {
			var oModel = new JSONModel([{
				firstName: "Harry",
				lastName: "Hawk",
				enabled: true,
				panelHeaderText: "Data Binding Basics",
				age: 1
			},
			{
				firstName: "Harry",
				lastName: "Hawk",
				enabled: true,
				panelHeaderText: "Data Binding Basics",
				age: 2
			},
			{
				firstName: "Harry",
				lastName: "Hawk",
				enabled: true,
				panelHeaderText: "Data Binding Basics",
				age: 3
			}])
		// Assign the model object to the SAPUI5 core
		sap.ui.getCore().setModel(oModel, "students");
		sap.ui.getCore().setModel({
			firstName: "Harry",
			lastName: "Hawk",
			enabled: true,
			panelHeaderText: "Data Binding Basics",
			age: 3
		}, "student");

		debugger;
		},

		sumAge: function(aValues) {
			var sumAge = 0;
			$.each(aValues, function(k, oValue) {
				sumAge += oValue.age;
			});
			debugger;
			return sumAge;
		}

	});

});

