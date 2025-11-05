import java.sql.*;
public class Main {

    private static final String url ="jdbc:mysql://localhost:3306/mydbs";

    private static final String username="root";

    private static final String password="root@123";
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            //    ------------->statatment.
            //Statement statement=connection.createStatement();

            //        print data  // reterive data;
//            String query="select * from students_1";
//            ResultSet resultSet=statement.executeQuery(query);
//            while(resultSet.next()){
//                int id=resultSet.getInt("id");
//                String name=resultSet.getString("name");
//                int age=resultSet.getInt("age");
//                double marks=resultSet.getDouble("marks");
//                System.out.println("ID: "+id);
//                System.out.println("Name: "+name);
//                System.out.println("age: "+age);
//                System.out.println("marks: "+marks);
//
//            }
            //               insert data;
//            String  query=String.format("insert into students_1(name,age,marks) values('%s',%o,%f)","Ajay", 23 , 80.24);
//            int rowaffected=statement.executeUpdate(query);
//            if(rowaffected>0){
//                System.out.println("Data Insert successfully");
//            }
//            else{
//                System.out.println("data not insert");
//            }
//
             //                   update data;

//            String  query=String.format("update students_1 set age=%d where id=%d",20,2);
//            int rowaffected=statement.executeUpdate(query);
//            if(rowaffected>0){
//                System.out.println("Data update successfully !");
//            }
//            else{
//                System.out.println("data not update");
//            }
                           // delete data;

//            String  query=String.format("delete  from students_1 where id=2");
//            int rowaffected=statement.executeUpdate(query);
//            if(rowaffected>0){
//                System.out.println("Data delete successfully !");
//            }
//            else{
//                System.out.println("data not delete !");
//            }


            //        ------>    prepared statement
                  //      insert data
//            String query="insert into students_1(name,age,marks) values(?,?,?)";
//            PreparedStatement preparedStatement=connection.prepareStatement(query);
//            preparedStatement.setString(1,"Murli");
//            preparedStatement.setInt(2,20);
//            preparedStatement.setDouble(3,90.98);
//            int rowaffected=preparedStatement.executeUpdate();
//            if(rowaffected>0){
//                System.out.println("Data insert successfully !");
//            }
//            else{
//                System.out.println("data not insert !");
//            }



            //                retrive data
//            String query="select marks from students_1 where id=?";
//            PreparedStatement preparedStatement=connection.prepareStatement(query);
//            preparedStatement.setInt(1,2);
//            ResultSet resultSet=preparedStatement.executeQuery();
//             if(resultSet.next()){
//                 double marks=resultSet.getDouble("marks");
//                 System.out.println("marks: "+ marks);
//             }
//             else{
//                 System.out.println("marks not found");
//             }

            //                     update data
//            String query="update students_1 set marks=? where id=?";
//            PreparedStatement preparedStatement=connection.prepareStatement(query);
//            preparedStatement.setDouble(1,86.9);
//            preparedStatement.setInt(2,4);
//            int rowaffected=preparedStatement.executeUpdate();
//            if(rowaffected>0){
//                System.out.println("Data update successfully !");
//            }
//            else{
//                System.out.println("data not update!");
//            }

            //              delete data
            String query="delete from students_1 where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,5);
            int rowaffected=preparedStatement.executeUpdate();
            if(rowaffected>0){
                System.out.println("Data delete successfully !");
            }
            else{
                System.out.println("data not delete!");
            }
        }

        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
