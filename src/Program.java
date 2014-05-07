
import java.awt.Dimension;

import javax.swing.JFrame;

import model.DashboardList;
import model.IDashboard;
import view.Window;

public class Program {

	public static IDashboard dashboard = new DashboardList();

	public static void main(String[] args) throws Exception {
		JFrame window = new Window("Add task");
		window.setMinimumSize(new Dimension(380, 340));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}