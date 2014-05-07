package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.State;


public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField txtTitle;
	private JTextArea txtDescription;
	private JComboBox<State> cboState;
	private JTextField txtCategory;
	private JTextField txtPriority;
	private JTextField txtOwner;
	private JTextField txtDueDate;

	public Window(String title) {
		super(title);
		init();
	}

	public void init() {
		setLayout(new BorderLayout());

		JPanel pnlFields = new JPanel(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.insets = new Insets(2, 2, 2, 2);

		// Title

		gc.gridx = 0;
		gc.gridy = 0;
		pnlFields.add(new JLabel("Title:"), gc);

		gc.gridx = 1;
		txtTitle = new JTextField();
		txtTitle.setPreferredSize(new Dimension(200, (int) txtTitle
				.getPreferredSize().getHeight()));
		pnlFields.add(txtTitle, gc);

		// Description

		gc.gridx = 0;
		gc.gridy = 1;
		JLabel lblDescription = new JLabel("Description:", SwingConstants.LEFT);
		lblDescription.setVerticalAlignment(SwingConstants.TOP);
		pnlFields.add(lblDescription, gc);

		gc.gridx = 1;
		txtDescription = new JTextArea();
		txtDescription.setPreferredSize(new Dimension(200, 100));
		JScrollPane scroll = new JScrollPane(txtDescription);
		pnlFields.add(scroll, gc);

		// State

		gc.gridx = 0;
		gc.gridy = 2;
		pnlFields.add(new JLabel("State:"), gc);

		gc.gridx = 1;
		cboState = new JComboBox<State>(State.values());
		cboState.setPreferredSize(new Dimension(200, (int) cboState
				.getPreferredSize().getHeight()));
		pnlFields.add(cboState, gc);

		// Category

		gc.gridx = 0;
		gc.gridy = 3;
		pnlFields.add(new JLabel("Category:"), gc);

		gc.gridx = 1;
		txtCategory = new JTextField();
		txtCategory.setPreferredSize(new Dimension(200, (int) txtCategory
				.getPreferredSize().getHeight()));
		pnlFields.add(txtCategory, gc);

		// Priority

		gc.gridx = 0;
		gc.gridy = 4;
		pnlFields.add(new JLabel("Priority:"), gc);

		gc.gridx = 1;
		txtPriority = new JTextField();
		txtPriority.setPreferredSize(new Dimension(200, (int) txtPriority
				.getPreferredSize().getHeight()));
		pnlFields.add(txtPriority, gc);

		// Owner

		gc.gridx = 0;
		gc.gridy = 5;
		pnlFields.add(new JLabel("Owner:"), gc);

		gc.gridx = 1;
		txtOwner = new JTextField();
		txtOwner.setPreferredSize(new Dimension(200, (int) txtOwner
				.getPreferredSize().getHeight()));
		pnlFields.add(txtOwner, gc);

		// Due date

		gc.gridx = 0;
		gc.gridy = 6;
		pnlFields.add(new JLabel("Due Date:"), gc);

		gc.gridx = 1;
		txtDueDate = new JTextField();
		txtDueDate.setPreferredSize(new Dimension(200, (int) txtDueDate
				.getPreferredSize().getHeight()));
		pnlFields.add(txtDueDate, gc);

		JPanel pnlButtons = new JPanel(new FlowLayout());

		pnlButtons.add(new JButton("Add"));
		pnlButtons.add(new JButton("Cancel"));

		add(pnlFields, BorderLayout.PAGE_START);
		add(pnlButtons, BorderLayout.PAGE_END);
	}

	public static void main(String... args) {
		JFrame window = new Window("Add task");
		window.setMinimumSize(new Dimension(380, 340));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}
}