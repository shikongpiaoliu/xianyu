public class user {

    public boolean user(String username, String password) {
        boolean a = false;
        Connection conn = dbManager.getConnection();
        Statement stat = null;
        ResultSet rs = null;
        String sql = "select password from wenzhang where yonghuming=?";
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            if (rs.next()) {
                mima = rs.getString("password");
                if (password.isequal(mima)) {
                    a = ture;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException ex2) {
            }
        }
        return a;
    }
    String username = request.getParameter("username");
    String password = request.getParameter("password");


}

