package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class xo extends JFrame {

	private JPanel contentPane;
	public static JLabel lblTurnoJugador;
	public static JLabel lblTurno;
	public static JButton btn1;
	public static JButton btn2;
	public static JButton btn3;
	public static JButton btn4;
	public static JButton btn5;
	public static JButton btn6;
	public static JButton btn7;
	public static JButton btn8;
	public static JButton btn9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					xo frame = new xo();
					frame.setVisible(true);

				} catch (Exception e) {

				}
			}

		});
	}

	/**
	 * Create the frame.
	 */
	public xo() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		btn1 = new JButton("");
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn1.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn1.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn1.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}
		});
		btn1.setBounds(23, 127, 73, 75);
		contentPane.add(btn1);

		btn2 = new JButton("");
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn2.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn2.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn2.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}

		});
		btn2.setBounds(105, 127, 73, 75);
		contentPane.add(btn2);

		btn3 = new JButton("");
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn3.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn3.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn3.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}
		});
		btn3.setBounds(188, 127, 73, 75);
		contentPane.add(btn3);

		btn4 = new JButton("");
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn4.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn4.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn4.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}

		});
		btn4.setBounds(23, 207, 73, 75);
		contentPane.add(btn4);

		btn5 = new JButton("");
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn5.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn5.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn5.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}
		});
		btn5.setBounds(105, 207, 73, 75);
		contentPane.add(btn5);

		btn6 = new JButton("");
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn6.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn6.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn6.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}
		});
		btn6.setBounds(188, 207, 73, 75);
		contentPane.add(btn6);

		btn7 = new JButton("");
		btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn7.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn7.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn7.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}
		});
		btn7.setBounds(23, 287, 73, 75);
		contentPane.add(btn7);

		btn8 = new JButton("");
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn8.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn8.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn8.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada");
				}

			}
		});
		btn8.setBounds(105, 287, 73, 75);
		contentPane.add(btn8);

		btn9 = new JButton("");
		btn9.setBackground(Color.WHITE);
		btn9.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn9.getText().equals("")) {
					if (lblTurno.getText().equals("X")) {
						btn9.setText("X");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 2");
						lblTurno.setText("0");
					} else {
						btn9.setText("0");
						comprobarFinDelJuego();
						lblTurnoJugador.setText("Turno del JUGADOR 1");
						lblTurno.setText("X");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Esta casilla esta utilizada.");
				}

			}
		});
		btn9.setBounds(188, 287, 73, 75);
		contentPane.add(btn9);

		JButton btnReiniciar = new JButton("REINICIAR PARTIDA");
		btnReiniciar.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnReiniciar.setBackground(Color.BLACK);
		btnReiniciar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
				btn1.setBackground(Color.WHITE);
				btn2.setBackground(Color.WHITE);
				btn3.setBackground(Color.WHITE);
				btn4.setBackground(Color.WHITE);
				btn5.setBackground(Color.WHITE);
				btn6.setBackground(Color.WHITE);
				btn7.setBackground(Color.WHITE);
				btn8.setBackground(Color.WHITE);
				btn9.setBackground(Color.WHITE);
				lblTurnoJugador.setText("Turno del JUGADOR 1");
				lblTurno.setText("X");

			}
		});
		btnReiniciar.setForeground(Color.WHITE);
		btnReiniciar.setBounds(23, 421, 238, 18);
		contentPane.add(btnReiniciar);

		lblTurnoJugador = new JLabel("Turno del JUGADOR 1");
		lblTurnoJugador.setForeground(Color.WHITE);
		lblTurnoJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurnoJugador.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblTurnoJugador.setBounds(23, 373, 238, 24);
		contentPane.add(lblTurnoJugador);

		lblTurno = new JLabel("X");
		lblTurno.setForeground(Color.WHITE);
		lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblTurno.setBounds(117, 389, 46, 34);
		contentPane.add(lblTurno);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		panel.setBounds(23, 51, 238, 66);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("X/0");
		lblNewLabel.setBounds(90, 11, 54, 43);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));

		JButton btnNewButton = new JButton("X");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(215, 11, 46, 34);
		contentPane.add(btnNewButton);
	}

	public void comprobarFinDelJuego() {
		if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("")
				&& !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("")
				&& !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "EMPATE");
		} else {
			comprobarGanador0();
			comprobarGanadorX();
		}
	}

	public void comprobarGanador0() {
		if (btn1.getText().equals("0") && btn2.getText().equals("0") && btn3.getText().equals("0")) {
			btn1.setBackground(Color.GREEN);
			btn2.setBackground(Color.GREEN);
			btn3.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
		} else {
			if (btn4.getText().equals("0") && btn5.getText().equals("0") && btn6.getText().equals("0")) {
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
			} else {
				if (btn7.getText().equals("0") && btn8.getText().equals("0") && btn9.getText().equals("0")) {
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
				} else {
					if (btn1.getText().equals("0") && btn4.getText().equals("0") && btn7.getText().equals("0")) {
						btn1.setBackground(Color.GREEN);
						btn4.setBackground(Color.GREEN);
						btn7.setBackground(Color.GREEN);
						JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
					} else {
						if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
							btn2.setBackground(Color.GREEN);
							btn5.setBackground(Color.GREEN);
							btn8.setBackground(Color.GREEN);
							JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
						} else {
							if (btn3.getText().equals("0") && btn6.getText().equals("0")
									&& btn9.getText().equals("0")) {
								btn3.setBackground(Color.GREEN);
								btn6.setBackground(Color.GREEN);
								btn9.setBackground(Color.GREEN);
								JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
							} else {
								if (btn1.getText().equals("0") && btn5.getText().equals("0")
										&& btn9.getText().equals("0")) {
									btn1.setBackground(Color.GREEN);
									btn5.setBackground(Color.GREEN);
									btn9.setBackground(Color.GREEN);
									JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
								} else {
									if (btn3.getText().equals("0") && btn5.getText().equals("0")
											&& btn7.getText().equals("0")) {
										btn3.setBackground(Color.GREEN);
										btn5.setBackground(Color.GREEN);
										btn7.setBackground(Color.GREEN);
										JOptionPane.showMessageDialog(null, "El jugador 2, GANA!");
									}
								}
							}
						}
					}
				}
			}

		}

	}

	public void comprobarGanadorX() {
		if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
			btn1.setBackground(Color.GREEN);
			btn2.setBackground(Color.GREEN);
			btn3.setBackground(Color.GREEN);
			JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
		} else {
			if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
				btn4.setBackground(Color.GREEN);
				btn5.setBackground(Color.GREEN);
				btn6.setBackground(Color.GREEN);
				JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
			} else {
				if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
					btn7.setBackground(Color.GREEN);
					btn8.setBackground(Color.GREEN);
					btn9.setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
				} else {
					if (btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
						btn1.setBackground(Color.GREEN);
						btn4.setBackground(Color.GREEN);
						btn7.setBackground(Color.GREEN);
						JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
					} else {
						if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
							btn2.setBackground(Color.GREEN);
							btn5.setBackground(Color.GREEN);
							btn8.setBackground(Color.GREEN);
							JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
						} else {
							if (btn3.getText().equals("X") && btn6.getText().equals("X")
									&& btn9.getText().equals("X")) {
								btn3.setBackground(Color.GREEN);
								btn6.setBackground(Color.GREEN);
								btn9.setBackground(Color.GREEN);
								JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
							} else {
								if (btn1.getText().equals("X") && btn5.getText().equals("X")
										&& btn9.getText().equals("X")) {
									btn1.setBackground(Color.GREEN);
									btn5.setBackground(Color.GREEN);
									btn9.setBackground(Color.GREEN);
									JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
								} else {
									if (btn3.getText().equals("X") && btn5.getText().equals("X")
											&& btn7.getText().equals("X")) {
										btn3.setBackground(Color.GREEN);
										btn5.setBackground(Color.GREEN);
										btn7.setBackground(Color.GREEN);
										JOptionPane.showMessageDialog(null, "El jugador 1, GANA!");
									}
								}
							}
						}
					}
				}
			}

		}

	}
}
