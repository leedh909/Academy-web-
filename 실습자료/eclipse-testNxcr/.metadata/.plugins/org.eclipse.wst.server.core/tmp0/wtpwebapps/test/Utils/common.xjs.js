//XJS=common.xjs
(function()
{
    return function(path)
    {
        var obj;
    
        // User Script
        this.registerScript(path, function() {
        this.test1 = function(msg){
        	alert("this.test1(Utils)= "+msg);
        };

        test2 = function(msg){
        	alert("window.test2(Utils)= "+msg);
        };

        var application = nexacro.getApplication();
        application.test3 =function(msg){ //_application
           	alert("application.test3(Utils): "+msg);
         	alert(application);
        	alert(appli);
        };

        var appli = nexacro.getApplication();
        appli.test4 = function(msg){
        	alert("test4: "+msg);
        };
        });
    
        this.loadIncludeScript(path);
        
        obj = null;
    };
}
)();
