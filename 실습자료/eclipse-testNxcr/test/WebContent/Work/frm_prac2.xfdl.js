(function()
{
    return function()
    {
        if (!this._is_form)
            return;
        
        var obj = null;
        
        this.on_create = function()
        {
            this.set_name("frm_prac2");
            this.set_titletext("New Form");
            if (Form == this.constructor)
            {
                this._setFormPosition(1280,720);
            }
            
            // Object(Dataset, ExcelExportObject) Initialize
            obj = new Dataset("Dataset00", this);
            obj._setContents("");
            this.addChild(obj.name, obj);
            
            // UI Components Initialize
            obj = new Button("Button00","88","52","120","50",null,null,null,null,null,null,this);
            obj.set_taborder("0");
            obj.set_text("Button00");
            this.addChild(obj.name, obj);

            obj = new Button("Button01","88","135","120","50",null,null,null,null,null,null,this);
            obj.set_taborder("1");
            obj.set_text("Button01");
            this.addChild(obj.name, obj);

            obj = new Button("Button02","88","215","120","50",null,null,null,null,null,null,this);
            obj.set_taborder("2");
            obj.set_text("Button02");
            this.addChild(obj.name, obj);

            obj = new Button("Button03","380","63","120","50",null,null,null,null,null,null,this);
            obj.set_taborder("3");
            obj.set_text("Button03");
            this.addChild(obj.name, obj);

            obj = new Button("Button04","380","160","120","50",null,null,null,null,null,null,this);
            obj.set_taborder("4");
            obj.set_text("Button04");
            this.addChild(obj.name, obj);

            obj = new Button("Button05","387","263","120","50",null,null,null,null,null,null,this);
            obj.set_taborder("5");
            obj.set_text("Button05");
            this.addChild(obj.name, obj);

            // Layout Functions
            //-- Default Layout : this
            obj = new Layout("default","",1280,720,this,function(p){});
            obj.set_mobileorientation("landscape");
            this.addLayout(obj.name, obj);
            
            // BindItem Information

        };
        
        this.loadPreloadList = function()
        {

        };
        
        // User Script
        this.addIncludeScript("frm_prac2.xfdl","Utils::common.xjs");
        this.registerScript("frm_prac2.xfdl", function() {
        //
        // this.Button00_onclick = function(obj:nexacro.Button,e:nexacro.ClickEventInfo)
        // {
        // 	_application.foo();
        // };
        //
        // this.Button01_onclick = function(obj:nexacro.Button,e:nexacro.ClickEventInfo)
        // {
        // 	_application.bar();
        // };

        //include "Work::work.common.xjs.xjs";
        this.executeIncludeScript("Utils::common.xjs"); /*include "Utils::common.xjs"*/;
        this.Button02_onclick = function(obj,e)
        {
        	alert("아아아아아아");
        	this.test1('안녕');
        };

        this.Button03_onclick = function(obj,e)
        {
        	test2("hello");
        };

        this.Button04_onclick = function(obj,e)
        {
         	_application.test3("hhhhhtest3");
        };

        this.Button05_onclick = function(obj,e)
        {
        	_application.test4("ddd");
        };

        });
        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.Button00.addEventHandler("onclick",this.Button00_onclick,this);
            this.Button01.addEventHandler("onclick",this.Button01_onclick,this);
            this.Button02.addEventHandler("onclick",this.Button02_onclick,this);
            this.Button03.addEventHandler("onclick",this.Button03_onclick,this);
            this.Button04.addEventHandler("onclick",this.Button04_onclick,this);
            this.Button05.addEventHandler("onclick",this.Button05_onclick,this);
        };

        this.loadIncludeScript("frm_prac2.xfdl");
        this.loadPreloadList();
        
        // Remove Reference
        obj = null;
    };
}
)();
