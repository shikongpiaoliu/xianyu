import java.util.*;
public class quanbuwenzhang {
    public  List findwenzhang(String username){
        Connection conn=dbManager.getConnection2();
        Statement stat=null;
        ResultSet rs=null;
        List wenzhangs=new ArrayList();
        String sql="select title from wenjuan where username=？";
        try {
            stat=conn.createStatement();
            rs=stat.executeQuery(sql);
            ps.setString(1,username);
            while(rs.next()) {
                wenzhang wenzhang=new wenzhang();
                wenzhang.setTitle(rs.getString("title"));
                wenzhangs.add(wenzhang);
            }
        }catch(SQLException ex) {
            ex.printStackTrace();
        }finally {
            try {
                if(rs!=null)
                    rs.close();
            }catch(SQLException ex2) {}
        }
        return wenzhangs;
    }
    public class wenzhang{
        private String title;
        public wenzhang() { }
        public void setTitle(String title) {
            this.title=title;
        }
        public String getTitle() {
            return title;
        }
    }
}
