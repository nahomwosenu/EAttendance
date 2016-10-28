/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nahom.org;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;


public class DBHelper extends SQLiteOpenHelper {

    final static String STUDENT_TABLE = "Student";
    final static String STUDENT_FIRST_NAME = "firstName";
    final static String STUDENT_LAST_NAME = "lastName";
    final static String STUDENT_ID = "id";
    final static String STUDENT_SECTION = "section";
    final static String STUDENT_DEPARTMENT = "department";
    final static String STUDENT_BATCH = "batch";
    final static String STUDENT_IMAGE = "image";
    final static String STUDENT_SEX = "sex";
    final static String SHEET_TABLE = "Sheet";
    final static String SHEET_DATE = "_date";
    final static String SHEET_SHIFT = "shift";
    final static String SHEET_COURSE = "course";
    final static String SHEET_DEPARTMENT = "department";
    final static String SHEET_LECTURE_NAME = "lectureName";
    final static String SHEET_BATCH = "batch";
    final static String SHEET_SECTION="_section";
    final static String ATTENDANCE_TABLE = "Attendance";
    final static String ATTENDANCE_STUDENT_ID = "sid";
    final static String ATTENDANCE_DATE = "_date";
    final static String ATTENDANCE_SHIFT = "shift";
    final static String ATTENDANCE_ATTEND = "attend";
    final static String ATTENDANCE_REMARKS = "remarks";
    final static String BLUETOOTH_TABLE = "Bluetooth";
    final static String BLUETOOTH_ID="id";
    final static String BLUETOOTH_MAC="mac";
    final static String DB_NAME = "attend.sql";
    
    
    public DBHelper(Context context) {
        super(context, DBHelper.DB_NAME, null, 1);
        
        
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Student (id TEXT,firstName TEXT,lastName TEXT,image INTEGER,"
                + "section TEXT,department TEXT, batch INTEGER,sex TEXT);");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1825/07','Nahom','Wosenu',"+R.drawable.male+",'B','IT',3,'male')");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1823/07','Muluken','Mengesha',"+R.drawable.male+",'B','IT',3,'male')");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1821/07','Negash','Regasa',24,'A','IT',"+R.drawable.male+",'male')");
        db.execSQL("CREATE TABLE Sheet (_date TEXT,shift TEXT,course TEXT,department TEXT,batch INTEGER, lectureName TEXT,_section TEXT);");
        db.execSQL("CREATE TABLE Bluetooth (id TEXT,mac TEXT);");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1825/07','00:CC:AC:04:BD');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1907/07','5E:EA:46:65:82:82');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1731/07','38:F8:89:6D:E3:5C');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1861/07','27:11:79:2E:62:50');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1638/07','3C:47:11:C0:8A:0D');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1762/07','AC:9E:17:11:30:D0');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1730/07','78:6A:89:A7:F7:1A');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1740/07','5C:3C:27:31:EB:05');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1904/07','38:F8:89:A2:20:41');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1823/07','00:00:46:65:82:01');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1869/07','90:67:1C:9B:7A:95');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1830/07','40:82:04:16:11:10');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1837/07','00:68:58:00:46:6A');");
        db.execSQL("INSERT INTO Bluetooth VALUES ('RAMIT/1656/07','58:2A:F7:1C:90:F9');");
        db.execSQL("CREATE TABLE Attendance (sid TEXT,_date TEXT,shift TEXT,attend INTEGER,remarks TEXT);");
        db.execSQL("INSERT INTO Attendance VALUES ('RAMIT/1823/07','07:02:2009','MORNING',1,'none');");
        db.execSQL("INSERT INTO Attendance VALUES ('RAMIT/1825/07','07:02:2009','MORNING',1,'none');");
        db.execSQL("INSERT INTO Attendance VALUES ('RAMIT/1827/07','07:02:2009','MORNING',0,'n/a');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1827/07','Negash','Regasa','negash','A','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1908/07','Yitbarek','Meskerem',"+R.drawable.yitbe+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1861/07','Surafel','Meshesha',"+R.drawable.surafel+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1731/07','Firomsa','Chala',"+R.drawable.male+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1762/07','Haile','Adugna',"+R.drawable.haile+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1638/07','Amanuel','Kinde',"+R.drawable.aman+",'A','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1730/07','Fikru','Asnake',"+R.drawable.male+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1740/07','Gebrie','Zemene',"+R.drawable.ic_launcher+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1904/07','Yimenu','Argaw',"+R.drawable.yimenu+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1837/07','Roba','Jarso',"+R.drawable.ic_launcher+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1869/07','Temesgen','Yadeta',"+R.drawable.ic_launcher+",'A','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1830/07','Nigatu','Chernet',"+R.drawable.ic_launcher+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Student VALUES ('RAMIT/1656/07','Bante','Uke',"+R.drawable.ic_launcher+",'B','IT',3,'male');");
        db.execSQL("INSERT INTO Sheet VALUES ('07:02:2009','MORNING','Advanced Programming','CSIT',3,'Abel','B');");
        db.execSQL("INSERT INTO Sheet VALUES ('07:02:2009','MORNING','Advanced Programming','CSIT',3,'Abel',NULL);");
        /*
"" +
"" +
+
"" +
"" +
"CREATE TABLE Attendance (" +
"	sid	TEXT," +
"	_date	TEXT," +
"	shift	TEXT," +
"	attend	INTEGER," +
"	remarks	TEXT" +
");" +
"INSERT INTO `Attendance` VALUES ('RAMIT/1823/07','07:02:2009','MORNING',1,'none');" +
"" +
"" +
"COMMIT;");
         */
    }

    public int getAttendanceCount(String date,String shift){
    int count=0;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor c=db.rawQuery("SELECT * FROM "+ATTENDANCE_TABLE+" WHERE "+ATTENDANCE_DATE+"='"+date+"' and "+ATTENDANCE_SHIFT+"='"+shift+"'", null);
        count=c.getCount();
    return count;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Student");
        onCreate(db);
       
    }
    public Cursor findStudent(String sid){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor result=db.rawQuery("SELECT * FROM STUDENT WHERE id='"+sid+"'", null);
        
        return result;
    }
    
    public boolean insertSheet(String date,String shift,String course,String dept,
                              int batch,String lecture,String section){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues value=new ContentValues();
        value.put(DBHelper.SHEET_DATE,date);
        value.put(DBHelper.SHEET_SHIFT, shift);
        value.put(DBHelper.SHEET_COURSE,course);
        value.put(DBHelper.SHEET_LECTURE_NAME,lecture);
        value.put(DBHelper.SHEET_DEPARTMENT, dept);
        value.put(DBHelper.SHEET_SECTION,section);
        value.put(DBHelper.SHEET_BATCH, batch);
        db.insert(DBHelper.SHEET_TABLE, null, value);
        return true;
    }

    public Cursor getStudentFirstName(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery("select " + DBHelper.STUDENT_FIRST_NAME + " from " + DBHelper.STUDENT_TABLE + " where id= '" + id + "'", null);
        return result;
    }

    public Cursor getBluetoothAddress(String id){
       SQLiteDatabase db=this.getReadableDatabase();
       Cursor result=db.rawQuery("select mac from Bluetooth where id='"+id+"'",null);
       return result;
    }
    
    public Cursor getBluetoothUser(String mac){
       SQLiteDatabase db=this.getReadableDatabase();
       Cursor result=db.rawQuery("select id from Bluetooth where mac='"+mac+"'",null);
       return result;
    }
    
    public Cursor getData(String table, String column, String condition, String value) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery("select " + column + " from " + table + " where " + condition + "='" + value + "'", null);
        return result;
    }

    public Cursor getAll(String table) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery("SELECT * FROM " + table + "", null);
        return result;
    }

    public Cursor getData(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery(query, null);
        return result;
    }

    public int getStudentCount() {
        SQLiteDatabase db = this.getReadableDatabase();
        int count = (int) DatabaseUtils.queryNumEntries(db, STUDENT_TABLE);
        return count;
    }
    public boolean insertBluetooth(String sid,String mac){
        SQLiteDatabase db=this.getReadableDatabase();
        String query="INSERT INTO "+BLUETOOTH_TABLE+" VALUES('"+sid+"','"+mac+"');";
        db.execSQL(query);
        return true;
    }
    public boolean studentFound(String sid){
        SQLiteDatabase db=this.getReadableDatabase();
        String query="SELECT * FROM Student where id='"+sid+"'";
        Cursor result=db.rawQuery(query, null);
        return result.getCount() >= 1;
    }
    public Cursor getAttended(String date,String shift){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor c=db.rawQuery("SELECT "+STUDENT_FIRST_NAME+","+STUDENT_LAST_NAME+","+ATTENDANCE_STUDENT_ID+","+ATTENDANCE_DATE+","+ATTENDANCE_SHIFT+" FROM "+ATTENDANCE_TABLE+"", selectionArgs)
        return null;
    }

    public boolean insertAttendace(String sid, String date, String shift, int attend, String rem) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ATTENDANCE_STUDENT_ID, sid);
        values.put(ATTENDANCE_DATE, date);
        values.put(ATTENDANCE_SHIFT, shift);
        values.put(ATTENDANCE_ATTEND, attend);
        values.put(ATTENDANCE_REMARKS, rem);
        db.insert(ATTENDANCE_TABLE, null, values);
        return true;
    }

    public boolean insertStudent(String firstName, String lastName, String id, String section, String department,
            int batch, String image,String sex) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(STUDENT_ID, id);
        values.put(STUDENT_FIRST_NAME, firstName);
        values.put(STUDENT_LAST_NAME, lastName);
        values.put(STUDENT_SECTION, section);
        values.put(STUDENT_BATCH, batch);
        values.put(STUDENT_DEPARTMENT, department);
        values.put(STUDENT_IMAGE, image);
        values.put(STUDENT_SEX, sex);
        db.insert(STUDENT_TABLE, null, values);
        return true;
    }
    public boolean addressExists(String mac){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor c=db.rawQuery("SELECT "+DBHelper.BLUETOOTH_MAC+" FROM "+DBHelper.BLUETOOTH_TABLE+" WHERE "+DBHelper.BLUETOOTH_MAC+"='"+mac+"'", null);
        return !c.isAfterLast();
    }
}
