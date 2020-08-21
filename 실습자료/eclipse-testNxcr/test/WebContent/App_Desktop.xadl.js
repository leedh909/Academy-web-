(function()
{
    return function()  
	{
        this.on_loadAppVariables = function()
        {		
            var obj = null;
            
            // global dataset
            obj = new Dataset("test", this);
            obj._setContents("<ColumnInfo><Column id=\"CODE\" type=\"STRING\" size=\"256\"/><Column id=\"VALUE\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"CODE\">01</Col><Col id=\"VALUE\">인사</Col></Row><Row><Col id=\"CODE\">02</Col><Col id=\"VALUE\">회계</Col></Row><Row><Col id=\"CODE\">03</Col><Col id=\"VALUE\">영업</Col></Row><Row><Col id=\"CODE\">04</Col><Col id=\"VALUE\">홍보</Col></Row></Rows>");
            this._addDataset(obj.name, obj);


            obj = new Dataset("gds_emp", this);
            obj._setContents("<ColumnInfo><Column id=\"EMPL_ID\" type=\"STRING\" size=\"10\"/><Column id=\"FULL_NAME\" type=\"STRING\" size=\"50\"/><Column id=\"DEPT_CD\" type=\"STRING\" size=\"10\"/><Column id=\"POS_CD\" type=\"STRING\" size=\"10\"/><Column id=\"HIRE_DATE\" type=\"DATE\" size=\"10\"/><Column id=\"SALARY\" type=\"INT\" size=\"10\"/><Column id=\"GENDER\" type=\"STRING\" size=\"10\"/><Column id=\"MARRIED\" type=\"STRING\" size=\"10\"/><Column id=\"MEMO\" type=\"STRING\" size=\"10\"/></ColumnInfo><Rows><Row><Col id=\"EMPL_ID\">AA001</Col><Col id=\"FULL_NAME\">Olivia</Col><Col id=\"DEPT_CD\">01</Col><Col id=\"POS_CD\">03</Col><Col id=\"HIRE_DATE\">20101003</Col><Col id=\"SALARY\">83000</Col><Col id=\"GENDER\">W</Col><Col id=\"MARRIED\">true</Col><Col id=\"MEMO\">ivory</Col></Row><Row><Col id=\"EMPL_ID\">AA002</Col><Col id=\"FULL_NAME\">John</Col><Col id=\"DEPT_CD\">02</Col><Col id=\"POS_CD\">04</Col><Col id=\"HIRE_DATE\">20051011</Col><Col id=\"SALARY\">76000</Col><Col id=\"GENDER\">M</Col><Col id=\"MARRIED\">false</Col><Col id=\"MEMO\">greenyellow</Col></Row><Row><Col id=\"EMPL_ID\">BB001</Col><Col id=\"FULL_NAME\">Jackson</Col><Col id=\"DEPT_CD\">03</Col><Col id=\"POS_CD\">03</Col><Col id=\"HIRE_DATE\">20070206</Col><Col id=\"SALARY\">95000</Col><Col id=\"GENDER\">M</Col><Col id=\"MARRIED\">true</Col><Col id=\"MEMO\">aliceblue</Col></Row><Row><Col id=\"EMPL_ID\">BB002</Col><Col id=\"FULL_NAME\">Maia</Col><Col id=\"DEPT_CD\">04</Col><Col id=\"POS_CD\">02</Col><Col id=\"HIRE_DATE\">20090512</Col><Col id=\"SALARY\">60000</Col><Col id=\"GENDER\">W</Col><Col id=\"MARRIED\">false</Col><Col id=\"MEMO\">ivory</Col></Row><Row><Col id=\"EMPL_ID\">CC001</Col><Col id=\"FULL_NAME\">Adam</Col><Col id=\"DEPT_CD\">01</Col><Col id=\"POS_CD\">04</Col><Col id=\"HIRE_DATE\">20010109</Col><Col id=\"SALARY\">88000</Col><Col id=\"GENDER\">M</Col><Col id=\"MARRIED\">true</Col><Col id=\"MEMO\">greenyellow</Col></Row><Row><Col id=\"EMPL_ID\">DD001</Col><Col id=\"FULL_NAME\">Ray</Col><Col id=\"DEPT_CD\">02</Col><Col id=\"POS_CD\">03</Col><Col id=\"HIRE_DATE\">20160202</Col><Col id=\"SALARY\">60000</Col><Col id=\"GENDER\">M</Col><Col id=\"MARRIED\">true</Col><Col id=\"MEMO\">lightpink</Col></Row></Rows>");
            this._addDataset(obj.name, obj);


            obj = new Dataset("gds_dept", this);
            obj._setContents("<ColumnInfo><Column id=\"code\" type=\"STRING\" size=\"256\"/><Column id=\"name\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"code\">01</Col><Col id=\"name\">개발</Col></Row><Row><Col id=\"code\">02</Col><Col id=\"name\">인사</Col></Row><Row><Col id=\"code\">03</Col><Col id=\"name\">교육</Col></Row><Row><Col id=\"code\">04</Col><Col id=\"name\">마케팅</Col></Row></Rows>");
            this._addDataset(obj.name, obj);


            obj = new Dataset("gds_menu", this);
            obj._setContents("<ColumnInfo><Column id=\"m_id\" type=\"STRING\" size=\"256\"/><Column id=\"m_name\" type=\"STRING\" size=\"256\"/><Column id=\"m_level\" type=\"STRING\" size=\"256\"/><Column id=\"m_url\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"m_id\">1</Col><Col id=\"m_name\">메뉴_1</Col><Col id=\"m_level\">0</Col></Row><Row><Col id=\"m_id\">2</Col><Col id=\"m_level\">1</Col><Col id=\"m_url\">Work::frm_prac1.xfdl</Col><Col id=\"m_name\">폼_1</Col></Row><Row><Col id=\"m_id\">3</Col><Col id=\"m_level\">0</Col><Col id=\"m_name\">메뉴_2</Col></Row><Row><Col id=\"m_id\">4</Col><Col id=\"m_level\">1</Col><Col id=\"m_name\">폼_1</Col><Col id=\"m_url\">Work::frm_prac2.xfdl</Col></Row><Row><Col id=\"m_id\">5</Col><Col id=\"m_level\">1</Col><Col id=\"m_name\">폼_2</Col><Col id=\"m_url\">Work::frm_prac1.xfdl</Col></Row></Rows>");
            this._addDataset(obj.name, obj);


            obj = new Dataset("member", this);
            obj._setContents("<ColumnInfo><Column id=\"NAME\" type=\"STRING\" size=\"256\"/><Column id=\"AGE\" type=\"STRING\" size=\"256\"/><Column id=\"ADDRESS\" type=\"STRING\" size=\"256\"/></ColumnInfo><Rows><Row><Col id=\"NAME\">A</Col><Col id=\"AGE\">B</Col><Col id=\"ADDRESS\">C</Col></Row><Row><Col id=\"NAME\">D</Col><Col id=\"AGE\">E</Col><Col id=\"ADDRESS\">F</Col></Row><Row><Col id=\"NAME\">G</Col><Col id=\"AGE\">H</Col><Col id=\"ADDRESS\">I</Col></Row><Row><Col id=\"NAME\">J</Col><Col id=\"AGE\">K</Col><Col id=\"ADDRESS\">M</Col></Row></Rows>");
            this._addDataset(obj.name, obj);
            
            // global variable

            
            obj = null;
        };
 
        // property, event, createMainFrame
        this.on_initApplication = function()
        {
            // properties
            this.set_id("App_Desktop");
            this.set_screenid("Desktop_screen");

            if (this._is_attach_childframe)
            	return;
        
            // frame
            var mainframe = this.createMainFrame("mainframe","0","0","1280","720",null,null,this);
            mainframe.set_showtitlebar("true");
            mainframe.set_showstatusbar("true");
            mainframe.on_createBodyFrame = this.mainframe_createBodyFrame;        

            // tray

        };
        
        this.loadPreloadList = function()
        {

        };
        
        this.mainframe_createBodyFrame = function()
        {
            var frame0 = new VFrameSet("VFrameSet00",null,null,null,null,null,null,this);
            this.addChild(frame0.name, frame0);
            this.frame=frame0;

            var frame1 = new ChildFrame("ChildFrame00",null,null,null,null,null,null,"Work::frm_prac1.xfdl",frame0);
            frame0.addChild(frame1.name, frame1);
            frame1.set_formurl("Work::frm_prac1.xfdl");


            var frame2 = new ChildFrame("ChildFrame01",null,null,null,null,null,null,"Work::frm_prac2.xfdl",frame0);
            frame0.addChild(frame2.name, frame2);
            frame2.set_formurl("Work::frm_prac2.xfdl");
        };
        
        this.on_initEvent = function()
        {

        };
        
        // script Compiler
        this.registerScript("App_Desktop.xadl", function() {
        this.foo = function(){
        	alert("foo");
        };
        _application.bar = function(){
        	alert("bar");
        };
        });

        this.checkLicense("");
        
        this.loadPreloadList();
        this.loadCss("xcssrc::text_css.xcss");
        this.loadIncludeScript("App_Desktop.xadl");
    };
}
)();
