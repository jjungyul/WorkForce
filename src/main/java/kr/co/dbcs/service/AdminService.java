package kr.co.dbcs.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public interface AdminService {

    void adminMenu() throws IOException, SQLException, ParseException;

    void showMenu() throws IOException;
}
