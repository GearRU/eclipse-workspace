package Hello;
 
import java.util.Scanner;
 
public class Lightning {
    public static void main(String[] args) {
        final double v = 330.0;
        double t, s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��������� ���������� ����� �������� ������ � ������ (������):");
        t = scanner.nextDouble();
        s = t * v;
        System.out.println("���������� �� ����� ����� ������: " + s + " ������");
    }
}