sap.ui.define([
    "sap/ui/core/UIComponent"
], function (UIComponent) {
    "use strict";

    return UIComponent.extend("sap.ui.demo.nav.Component", {

        metadata: {
            manifest: "json"
        },

        init: function () {
            // call the init function of the parent
            
            UIComponent.prototype.init.apply(this, [{ arr : 
            [
                {a : 1},
                {a : 6},
                {a : 5},
                {a : 4},
                {a : 3},
                {a : 2}
            ]}]);

            // create the views based on the url/hash
            this.getRouter().initialize();
        }
    });
});