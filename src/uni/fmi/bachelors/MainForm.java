package uni.fmi.bachelors;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JTextField critChance1;
	private JTextField attackSpeed1;
	private JTextField dmg1;
	private JTextField hp1;
	private JTextField name1;
	private JTextField critChance2;
	private JTextField attackSpeed2;
	private JTextField dmg2;
	private JTextField hp2;
	private JTextField name2;
	private JTextField bossCleaveChance;
	private JTextField bossAttackSpeed;
	private JTextField bossDamage;
	private JTextField bossHP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 65, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblHp = new JLabel("HP: ");
		lblHp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHp.setBounds(10, 47, 65, 25);
		contentPane.add(lblHp);
		
		JLabel lblDamage = new JLabel("Damage: ");
		lblDamage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDamage.setBounds(10, 83, 88, 25);
		contentPane.add(lblDamage);
		
		JLabel lblAttackSpeed = new JLabel("Attack Speed: ");
		lblAttackSpeed.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAttackSpeed.setBounds(10, 119, 130, 25);
		contentPane.add(lblAttackSpeed);
		
		JLabel lblCriticalChance = new JLabel("Critical Chance: ");
		lblCriticalChance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCriticalChance.setBounds(10, 155, 145, 25);
		contentPane.add(lblCriticalChance);
		
		critChance1 = new JTextField();
		critChance1.setBounds(117, 159, 86, 20);
		contentPane.add(critChance1);
		critChance1.setColumns(10);
		
		attackSpeed1 = new JTextField();
		attackSpeed1.setColumns(10);
		attackSpeed1.setBounds(117, 123, 86, 20);
		contentPane.add(attackSpeed1);
		
		dmg1 = new JTextField();
		dmg1.setColumns(10);
		dmg1.setBounds(117, 87, 86, 20);
		contentPane.add(dmg1);
		
		hp1 = new JTextField();
		hp1.setColumns(10);
		hp1.setBounds(117, 51, 86, 20);
		contentPane.add(hp1);
		
		name1 = new JTextField();
		name1.setColumns(10);
		name1.setBounds(117, 15, 86, 20);
		contentPane.add(name1);
		
		JLabel lblCriticalChance_1 = new JLabel("Critical Chance: ");
		lblCriticalChance_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCriticalChance_1.setBounds(351, 155, 145, 25);
		contentPane.add(lblCriticalChance_1);
		
		critChance2 = new JTextField();
		critChance2.setColumns(10);
		critChance2.setBounds(458, 159, 86, 20);
		contentPane.add(critChance2);
		
		attackSpeed2 = new JTextField();
		attackSpeed2.setColumns(10);
		attackSpeed2.setBounds(458, 123, 86, 20);
		contentPane.add(attackSpeed2);
		
		JLabel lblAttackSpeed_1 = new JLabel("Attack Speed: ");
		lblAttackSpeed_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAttackSpeed_1.setBounds(351, 119, 130, 25);
		contentPane.add(lblAttackSpeed_1);
		
		JLabel lblDamage_1 = new JLabel("Damage: ");
		lblDamage_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDamage_1.setBounds(351, 83, 88, 25);
		contentPane.add(lblDamage_1);
		
		dmg2 = new JTextField();
		dmg2.setColumns(10);
		dmg2.setBounds(458, 87, 86, 20);
		contentPane.add(dmg2);
		
		hp2 = new JTextField();
		hp2.setColumns(10);
		hp2.setBounds(458, 51, 86, 20);
		contentPane.add(hp2);
		
		JLabel lblHp_1 = new JLabel("HP: ");
		lblHp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHp_1.setBounds(351, 47, 65, 25);
		contentPane.add(lblHp_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(351, 11, 65, 25);
		contentPane.add(lblNewLabel_1);
		
		name2 = new JTextField();
		name2.setColumns(10);
		name2.setBounds(458, 15, 86, 20);
		contentPane.add(name2);
		
		JButton btnNewButton = new JButton("FIGHT!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get info for m1
				String m1name = name1.getText();
				int m1hp = Integer.parseInt(hp1.getText());
				int m1dmg = Integer.parseInt(dmg1.getText());
				double m1AttackSpeed = Double.parseDouble(attackSpeed1.getText());
				int m1CritChance = Integer.parseInt(critChance1.getText());
				// get info for m2
				String m2name = name2.getText();
				int m2hp = Integer.parseInt(hp2.getText());
				int m2dmg = Integer.parseInt(dmg2.getText());
				double m2AttackSpeed = Double.parseDouble(attackSpeed2.getText());
				int m2CritChance = Integer.parseInt(critChance2.getText());
				// get info for boss
				int bHP = Integer.parseInt(bossHP.getText());
				int bDMG = Integer.parseInt(bossDamage.getText());
				double bAttackSpeed = Double.parseDouble(bossAttackSpeed.getText());
				int bCleaveChance = Integer.parseInt(bossCleaveChance.getText());
				// create monster objects
				Monster m1 = new Monster(m1name, m1hp, m1dmg, m1AttackSpeed, m1CritChance);
				Monster m2 = new Monster(m2name, m2hp, m2dmg, m2AttackSpeed, m2CritChance);
				// create boss object
				Boss b1 = new Boss(bHP, bDMG, bAttackSpeed, bCleaveChance);
				// add monsters to boss targets array list
				b1.getTargets().add(m1);
				b1.getTargets().add(m2);
				// set boss as the target for the monsters
				m1.setTarget(b1);
				m2.setTarget(b1);
				// start battle
				m1.start();
				m2.start();
				b1.start();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(406, 357, 138, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("BOSS STATS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(129, 227, 119, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblHp_2 = new JLabel("HP: ");
		lblHp_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHp_2.setBounds(55, 268, 65, 25);
		contentPane.add(lblHp_2);
		
		JLabel lblDamage_2 = new JLabel("Damage: ");
		lblDamage_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDamage_2.setBounds(55, 304, 88, 25);
		contentPane.add(lblDamage_2);
		
		JLabel lblAttackSpeed_2 = new JLabel("Attack Speed: ");
		lblAttackSpeed_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAttackSpeed_2.setBounds(55, 340, 130, 25);
		contentPane.add(lblAttackSpeed_2);
		
		JLabel lblCleaveChance = new JLabel("Cleave Chance: ");
		lblCleaveChance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCleaveChance.setBounds(55, 376, 145, 25);
		contentPane.add(lblCleaveChance);
		
		bossCleaveChance = new JTextField();
		bossCleaveChance.setColumns(10);
		bossCleaveChance.setBounds(162, 380, 86, 20);
		contentPane.add(bossCleaveChance);
		
		bossAttackSpeed = new JTextField();
		bossAttackSpeed.setColumns(10);
		bossAttackSpeed.setBounds(162, 344, 86, 20);
		contentPane.add(bossAttackSpeed);
		
		bossDamage = new JTextField();
		bossDamage.setColumns(10);
		bossDamage.setBounds(162, 308, 86, 20);
		contentPane.add(bossDamage);
		
		bossHP = new JTextField();
		bossHP.setColumns(10);
		bossHP.setBounds(162, 272, 86, 20);
		contentPane.add(bossHP);
	}
}
