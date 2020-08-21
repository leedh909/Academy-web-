(function()
{
    return function()
    {
        if (!this._is_form)
            return;
        
        var obj = null;
        
        this.on_create = function()
        {
            this.set_name("form_Test");
            this.set_titletext("New Form");
            if (Form == this.constructor)
            {
                this._setFormPosition(1280,720);
            }
            
            // Object(Dataset, ExcelExportObject) Initialize
            obj = new Dataset("ds_photo", this);
            obj._setContents("<ColumnInfo><Column id=\"name\" type=\"STRING\" size=\"256\"/><Column id=\"url\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"name\">강아지1</Col><Col id=\"url\">imagerc::image1.jpg</Col></Row><Row><Col id=\"name\">강아지2</Col><Col id=\"url\">imagerc::image2.jpg</Col></Row><Row><Col id=\"name\">강아지3</Col><Col id=\"url\">imagerc::image3.jpg</Col></Row></Rows>");
            this.addChild(obj.name, obj);
            
            // UI Components Initialize
            obj = new Grid("Grid00","65","37","210","222",null,null,null,null,null,null,this);
            obj.set_taborder("1");
            obj.set_binddataset("gds_emp");
            obj.set_autofittype("col");
            obj._setContents("<Formats><Format id=\"default\"><Columns><Column size=\"80\"/><Column size=\"80\"/></Columns><Rows><Row size=\"24\" band=\"head\"/><Row size=\"24\"/></Rows><Band id=\"head\"><Cell text=\"EMPL_ID\"/><Cell col=\"1\" text=\"FULL_NAME\"/></Band><Band id=\"body\"><Cell text=\"bind:EMPL_ID\" maskeditformat=\"AA-###\" maskedittype=\"string\"/><Cell col=\"1\" text=\"bind:FULL_NAME\"/></Band></Format></Formats>");
            this.addChild(obj.name, obj);

            obj = new Div("Div00","330","30","460","545",null,null,null,null,null,null,this);
            obj.set_taborder("1");
            obj.set_text("Div00");
            obj.set_border("2px solid aqua");
            this.addChild(obj.name, obj);

            obj = new Static("Static00","33","26","154","39",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("0");
            obj.set_text("FullName");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Static("Static01","33","75","155","40",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("1");
            obj.set_text("Empl_ID");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Static("Static02","33","125","154","40",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("2");
            obj.set_text("HireDate");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Static("Static03","33","180","154","37",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("3");
            obj.set_text("Married");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Static("Static04","33","227","154","47",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("4");
            obj.set_text("Salary");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Static("Static05","33","283","154","44",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("5");
            obj.set_text("Gender");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Static("Static06","33","337","154","45",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("6");
            obj.set_text("Dept_ID");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Static("Static07","33","394","154","46",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("7");
            obj.set_text("MEMO");
            obj.set_background("pink");
            obj.set_font("18px/normal \"Arial Black\"");
            obj.set_textAlign("center");
            this.Div00.addChild(obj.name, obj);

            obj = new Edit("Edit00","223","26","202","39",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("8");
            this.Div00.addChild(obj.name, obj);

            obj = new MaskEdit("MaskEdit00","223","75","204","40",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("9");
            obj.set_format("AA-###");
            obj.set_type("string");
            this.Div00.addChild(obj.name, obj);

            obj = new MaskEdit("MaskEdit01","223","227","204","43",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("10");
            obj.set_format("#,###");
            this.Div00.addChild(obj.name, obj);

            obj = new Calendar("Calendar00","223","125","204","40",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("11");
            this.Div00.addChild(obj.name, obj);

            obj = new CheckBox("CheckBox00","225","180","188","37",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("12");
            obj.set_text("결혼여부");
            this.Div00.addChild(obj.name, obj);

            obj = new Radio("Radio00","237","283","170","44",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("13");
            obj.set_codecolumn("codecolumn");
            obj.set_datacolumn("datacolumn");
            obj.set_direction("vertical");
            var Div00_form_Radio00_innerdataset = new nexacro.NormalDataset("Div00_form_Radio00_innerdataset", obj);
            Div00_form_Radio00_innerdataset._setContents("<ColumnInfo><Column id=\"codecolumn\" size=\"256\"/><Column id=\"datacolumn\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"codecolumn\">M</Col><Col id=\"datacolumn\">남성</Col></Row><Row><Col id=\"codecolumn\">W</Col><Col id=\"datacolumn\">여성</Col></Row></Rows>");
            obj.set_innerdataset(Div00_form_Radio00_innerdataset);
            this.Div00.addChild(obj.name, obj);

            obj = new Combo("Combo00","224","337","203","43",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("14");
            obj.set_innerdataset("gds_dept");
            obj.set_codecolumn("code");
            obj.set_datacolumn("name");
            obj.set_text("");
            this.Div00.addChild(obj.name, obj);

            obj = new TextArea("TextArea00","223","394","202","121",null,null,null,null,null,null,this.Div00.form);
            obj.set_taborder("2");
            this.Div00.addChild(obj.name, obj);

            // Layout Functions
            //-- Default Layout : this
            obj = new Layout("default","",1280,720,this,function(p){});
            obj.set_mobileorientation("landscape");
            this.addLayout(obj.name, obj);
            
            // BindItem Information
            obj = new BindItem("item0","Div00.form.Edit00","value","gds_emp","FULL_NAME");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item1","Div00.form.MaskEdit00","value","gds_emp","EMPL_ID");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item2","Div00.form.Calendar00","value","gds_emp","HIRE_DATE");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item3","Div00.form.CheckBox00","value","gds_emp","MARRIED");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item4","Div00.form.MaskEdit01","value","gds_emp","SALARY");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item5","Div00.form.Radio00","value","gds_emp","GENDER");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item6","Div00.form.TextArea00","value","gds_emp","MEMO");
            this.addChild(obj.name, obj);
            obj.bind();

            obj = new BindItem("item7","Div00.form.Combo00","value","gds_emp","DEPT_CD");
            this.addChild(obj.name, obj);
            obj.bind();
        };
        
        this.loadPreloadList = function()
        {

        };
        
        // User Script

        
        // Regist UI Components Event
        this.on_initEvent = function()
        {
            this.Div00.form.Static03.addEventHandler("onclick",this.Div00_Static03_onclick,this);
        };

        this.loadIncludeScript("form_Test.xfdl");
        this.loadPreloadList();
        
        // Remove Reference
        obj = null;
    };
}
)();
