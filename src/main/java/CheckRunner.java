import check.Check;
import db.DAO;
import db.FileDAO;
import db.InitDataBase;
import parser.CommandLineParser;
import util.SaveToFile;

public class CheckRunner {

    public static void main(String[] args) {
        DAO DaoObject = FileDAO.getInstance();
        InitDataBase.init(DaoObject);
        Check check = new Check();
        CommandLineParser.parse(args, check, DaoObject);
        check.calculate();
        check.printCheck().forEach(System.out::println);
        SaveToFile.saveCheckToFile("Check.txt",check.printCheck());

    }


}