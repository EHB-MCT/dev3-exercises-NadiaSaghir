import java.sql.*
import java.util.*

fun main(){
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
    val credentials = Credentials();
    // Prepare credentials
    val connectionProps = Properties()
    connectionProps ["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword
// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps
    )
    var search = readLine()

    val statement = connection.prepareStatement("SELECT * FROM rides WHERE destination_city = '$search'")
// Replace the var without allowing full queries to be entered
    val result = statement.executeQuery()

    println(result)
}