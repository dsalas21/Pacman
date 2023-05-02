package Juego;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Dimension;

public class PacMan {

	private JFrame frame;
	public int pac_x=220,pac_y=190;
	public int speed=5,diametro =5,separacion=20,puntaje=0,angulo=45;
	public Element pacman = new Element(pac_x,pac_y , 30, 30, Color.yellow);
	public Element pared1= new Element (0, 0, 180, 10,Color.red);
	public Element pared2= new Element(0,0,10,480,Color.red);
	public Element pared3= new Element (0, 410, 10, 480,Color.red);
	public Element pared4= new Element(470,0,180,10,Color.red);
	public Element pared5= new Element(470,230,180,10,Color.red);
	public Element pared6= new Element(0,230,180,10,Color.red);
	
	public Element lab1= new Element(60,300,60,10,Color.red);
	public Element lab11= new Element(60,360,10,40,Color.red);
	public Element lab2= new Element(60,60,60,10,Color.red);
	public Element lab22= new Element(60,50,10,40,Color.red);
	public Element lab3= new Element(90,250,10,40,Color.red);
	public Element lab33= new Element(90,150,10,40,Color.red);
	
	public Element lab4= new Element(410,300,60,10,Color.red);
	public Element lab44= new Element(380,360,10,40,Color.red);
	public Element lab5= new Element(410,60,60,10,Color.red);
	public Element lab55= new Element(380,50,10,40,Color.red);
	public Element lab6= new Element(350,250,10,40,Color.red);
	public Element lab66= new Element(350,150,10,40,Color.red);
	
	public Element lab7= new Element(150,00,60,10,Color.red);
	public Element lab8= new Element(320,00,60,10,Color.red);
	public Element lab9= new Element(150,360,60,10,Color.red);
	public Element lab10= new Element(320,360,60,10,Color.red);
	public Element lab12= new Element(190,70,10,100,Color.red);
	public Element lab13= new Element(190,340,10,100,Color.red);
	
	public Element caja= new Element(180,250,10,120,Color.red);
	public Element caja1= new Element(180,190,70,10,Color.red);
	public Element caja2= new Element(180,190,10,30,Color.red);
	public Element caja3= new Element(270,190,10,30,Color.red);
	public Element caja4= new Element(290,190,70,10,Color.red);
	
//	ArrayList<Element> bolitas = new ArrayList<>();
	 private ArrayList<Point> bolita,bolita2,bolita4,bolita5,bolita6;
	 private ArrayList<Point>bolita3,bolita7,bolita8,bolita9,bolita10,bolita11,bolita12,bolita13,bolita14;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacMan window = new PacMan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PacMan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.requestFocus();
		frame.setFocusable(true);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton reinicio = new JButton("Reiniciar");
		panel.add(reinicio);
		
		JLabel lblNewLabel = new JLabel("Puntuacion:");
		panel.add(lblNewLabel);
		
		JLabel marcador = new JLabel("0");
		panel.add(marcador);
		
		
		JPanel tablero = new JPanel();
		tablero.setBackground(new Color(124, 252, 0));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		tablero.add(new MyGraphics());
		 bolita = new ArrayList<>();
		 bolita2 = new ArrayList<>();
		 bolita3 = new ArrayList<>();
		 bolita4 = new ArrayList<>();
		 bolita5 = new ArrayList<>();
		 bolita6 = new ArrayList<>();
		 bolita7=new ArrayList<>();
		 bolita8=new ArrayList<>();
		 bolita9=new ArrayList<>();
		 bolita10=new ArrayList<>();
		 bolita11=new ArrayList<>();		 
		 bolita12=new ArrayList<>();
		 bolita13=new ArrayList<>();
		 bolita14=new ArrayList<>();

		 for (int i = 0; i < 19; i++) {
             bolita.add(new Point( separacion+5 + diametro, i * separacion + diametro+10));
         }
		 
		 for (int i = 0; i < 5; i++) {
             bolita2.add(new Point( i*separacion+5 + diametro,  separacion + diametro+10));
         }
		 
		 for (int i = 0; i < 19; i++) {
             bolita3.add(new Point( separacion+5 + diametro, i * separacion + diametro+10));
         }
		 
		 for (int i = 0; i < 5; i++) {
             bolita4.add(new Point( i*separacion+5 + diametro,  separacion + diametro+10));
         }
		 
		 for (int i = 0; i < 7; i++) {
             bolita5.add(new Point( i*separacion+130 + diametro,  separacion + diametro+10));
         }
		 
		 for (int i = 0; i < 7; i++) {
             bolita6.add(new Point( i*separacion+130 + diametro,  separacion + diametro+10));
         }
		 
		 for (int i = 0; i < 5; i++) {
             bolita7.add(new Point( i*separacion+300 + diametro,  separacion + diametro+10));
         }
		 for (int i = 0; i < 5; i++) {
             bolita8.add(new Point( i*separacion+300 + diametro,  separacion + diametro+10));
         }
		 
		 for (int i = 0; i < 16; i++) {
             bolita9.add(new Point( i* separacion+45 + diametro, i * separacion + diametro+10));
         }
		 for (int i = 0; i < 16; i++) {
             bolita10.add(new Point( i* separacion+45 + diametro, i * separacion + diametro+10));
         }
		 for (int i = 0; i < 10; i++) {
             bolita11.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
         }
		 for (int i = 0; i < 10; i++) {
             bolita12.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
         }
		 for (int i = 0; i < 10; i++) {
             bolita13.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
         }
		 for (int i = 0; i < 10; i++) {
             bolita14.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
         }
		
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
			//	System.out.println(e.getKeyCode());
				
				
				
				if(e.getKeyCode()==87) {
					pacman.y-=speed;
					
				}
				
				if(e.getKeyCode()==83) {
					pacman.y+=speed;
					
				}
				if(e.getKeyCode()==65) {
					pacman.x-=speed;
				}
				if(e.getKeyCode()==68) {
					pacman.x+=speed;
				}
				
				tablero.repaint();

				if(pacman.tocando(pared1)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(pared2)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(pared3)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				if(pacman.tocando(pared4)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(pared5)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(pared6)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab1)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab11)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab2)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				if(pacman.tocando(lab22)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab3)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab33)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab4)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab44)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab5)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				if(pacman.tocando(lab55)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab6)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab66)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
if(pacman.tocando(lab7)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab8)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab9)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab10)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab12)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(lab13)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				if(pacman.tocando(caja)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(caja1)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(caja2)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
				}
				
				if(pacman.tocando(caja3)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
				if(pacman.tocando(caja4)) {
	            	
	            	if(e.getKeyCode()==87) {
						pacman.y+=speed;
						
					}
	            	
	            	if(e.getKeyCode()==83) {
						pacman.y-=speed;
						
					}
					if(e.getKeyCode()==65) {
						pacman.x+=speed;
					}
					if(e.getKeyCode()==68) {
						pacman.x-=speed;
					}
	            	
	            }
				
		
				
				
				
				if(pacman.teletransporte(pacman)==1) {
					pacman.x=480;
					pacman.x-=speed;
					
					
					
				}else if(pacman.teletransporte(pacman)==2) {
					pacman.x=-30;
					pacman.x+=speed;
				}
				
				pacman.comer(pacman);
			
				String puntos = Integer.toString(puntaje);
				marcador.setText(puntos);
				panel.repaint();
				panel.revalidate();
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			
			
		});
		
	
	
	
	
	
	reinicio.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			bolita.clear();
			bolita2.clear();
			bolita3.clear();
			bolita4.clear();
			bolita5.clear();
			bolita6.clear();
			bolita7.clear();
			bolita8.clear();
			bolita9.clear();
			bolita10.clear();
			bolita11.clear();
			bolita12.clear();
			bolita13.clear();
			bolita14.clear();
			for (int i = 0; i < 19; i++) {
	             bolita.add(new Point( separacion+5 + diametro, i * separacion + diametro+10));
	         }
			 
			 for (int i = 0; i < 5; i++) {
	             bolita2.add(new Point( i*separacion+5 + diametro,  separacion + diametro+10));
	         }
			 
			 for (int i = 0; i < 19; i++) {
	             bolita3.add(new Point( separacion+5 + diametro, i * separacion + diametro+10));
	         }
			 
			 for (int i = 0; i < 5; i++) {
	             bolita4.add(new Point( i*separacion+5 + diametro,  separacion + diametro+10));
	         }
			 
			 for (int i = 0; i < 7; i++) {
	             bolita5.add(new Point( i*separacion+130 + diametro,  separacion + diametro+10));
	         }
			 
			 for (int i = 0; i < 7; i++) {
	             bolita6.add(new Point( i*separacion+130 + diametro,  separacion + diametro+10));
	         }
			 
			 for (int i = 0; i < 5; i++) {
	             bolita7.add(new Point( i*separacion+300 + diametro,  separacion + diametro+10));
	         }
			 for (int i = 0; i < 5; i++) {
	             bolita8.add(new Point( i*separacion+300 + diametro,  separacion + diametro+10));
	         }
			 
			 for (int i = 0; i < 16; i++) {
	             bolita9.add(new Point( i* separacion+45 + diametro, i * separacion + diametro+10));
	         }
			 for (int i = 0; i < 16; i++) {
	             bolita10.add(new Point( i* separacion+45 + diametro, i * separacion + diametro+10));
	         }
			 for (int i = 0; i < 10; i++) {
	             bolita11.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
	         }
			 for (int i = 0; i < 10; i++) {
	             bolita12.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
	         }
			 for (int i = 0; i < 10; i++) {
	             bolita13.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
	         }
			 for (int i = 0; i < 10; i++) {
	             bolita14.add(new Point( separacion-5 + diametro, i * separacion+105 + diametro));
	         }
			
			pacman.x=pac_x;
			pacman.y=pac_y;
			puntaje=0;

			String puntos = Integer.toString(puntaje);
			marcador.setText(puntos);
			panel.repaint();
			panel.revalidate();
			tablero.repaint();
			tablero.revalidate();
			frame.repaint();
			frame.revalidate();

	        frame.requestFocusInWindow();
			
			
			
			
		}
		
		
		
		
	});
		
		
	
	}
	
	
	
	
	
	
	 public class MyGraphics extends JComponent {

	        private static final long serialVersionUID = 1L;

	        MyGraphics() {
	            setPreferredSize(new Dimension(480, 420));
	        }

	        @Override
	        public void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.fillRect(0, 0, 480, 420);
	        
	            g.setColor(Color.yellow);
	            g.fillArc(pacman.x,pacman.y , pacman.w, pacman.h, angulo, 270);
	            //pared
	            g.setColor(Color.blue);
	            g.fillRect(pared1.x, pared1.y, pared1.w, pared1.h);
	            //pared 2
	            
	            g.fillRect(pared2.x, pared2.y, pared2.w, pared2.h);
	            
	            //pared 3
	           
	            g.fillRect(pared3.x,pared3.y, pared3.w, pared3.h);
	        
	            //pared 4
	            
	            g.fillRect(pared4.x, pared4.y, pared4.w, pared4.h);
	           //pared5
	            g.fillRect(pared5.x, pared5.y, pared5.w, pared5.h);
	            //PARED 6
	            g.fillRect(pared6.x, pared6.y, pared6.w	, pared6.h);
	            
	            //Izquierda
	            g.fillRect(lab1.x, lab1.y, lab1.w, lab1.h);
	            g.fillRect(lab11.x, lab11.y, lab11.w, lab11.h);
	            g.fillRect(lab2.x, lab2.y, lab2.w, lab2.h);
	            g.fillRect(lab22.x, lab22.y, lab22.w, lab22.h);
	            g.fillRect(lab3.x, lab3.y, lab3.w, lab3.h);
	            g.fillRect(lab33.x, lab33.y, lab33.w, lab33.h);
	            //Derecha
	            g.fillRect(lab4.x, lab4.y, lab4.w, lab4.h);
	            g.fillRect(lab44.x, lab44.y, lab44.w, lab44.h);
	            g.fillRect(lab5.x, lab5.y, lab5.w, lab5.h);
	            g.fillRect(lab55.x, lab55.y, lab55.w, lab55.h);
	            g.fillRect(lab6.x, lab6.y, lab6.w, lab6.h);
	            g.fillRect(lab66.x, lab66.y, lab66.w, lab66.h);
	            
	            //lineas de el medio
	            
	            g.fillRect(lab7.x, lab7.y, lab7.w, lab7.h);
	            g.fillRect(lab8.x, lab8.y, lab8.w, lab8.h);
	            g.fillRect(lab9.x, lab9.y, lab9.w, lab9.h);
	            g.fillRect(lab10.x, lab10.y, lab10.w, lab10.h);
	            g.fillRect(lab12.x, lab12.y, lab12.w, lab12.h);
	            g.fillRect(lab13.x, lab13.y, lab13.w, lab13.h);
	            //caja del medio
	            g.fillRect(caja.x, caja.y, caja.w, caja.h);
	            g.fillRect(caja1.x, caja1.y, caja1.w, caja1.h);
	            g.fillRect(caja2.x, caja2.y, caja2.w, caja2.h);
	            g.fillRect(caja3.x, caja3.y, caja3.w, caja3.h);
	            g.fillRect(caja4.x, caja4.y, caja4.w, caja4.h);
	            
	            
	            g.setColor(Color.WHITE);
	            for (Point dot : bolita) {
	                g.fillOval(dot.x - diametro, dot.y + diametro*2, diametro * 2, diametro * 2);
	            }
	            
	            for (Point dot2 : bolita2) {
	                g.fillOval(dot2.x - diametro+40, dot2.y=15 + diametro*2, diametro * 2, diametro * 2);
	            }
	            
	            for (Point dot3 : bolita3) {
	                g.fillOval(dot3.x=450 - diametro, dot3.y + diametro*2, diametro * 2, diametro * 2);
	            }
	            
	            for (Point dot4 : bolita4) {
	                g.fillOval(dot4.x - diametro+40, dot4.y=375 + diametro*2, diametro * 2, diametro * 2);
	            }
	            
	            for (Point dot5 : bolita5) {
	            	
	            	g.fillOval(dot5.x - diametro+40 , dot5.y=15 + diametro*2, diametro * 2, diametro * 2);
	            }
	            
	            for (Point dot6 : bolita6) {
	                g.fillOval(dot6.x  - diametro+40, dot6.y=375 + diametro*2, diametro * 2, diametro * 2);
	            }
	            
	            for (Point dot7 : bolita7) {
	                g.fillOval(dot7.x - diametro+40, dot7.y=15 + diametro*2, diametro * 2, diametro * 2);
	            }
	            
	            for (Point dot8 : bolita8) {
	                g.fillOval(dot8.x - diametro+40, dot8.y=375 + diametro*2, diametro * 2, diametro * 2);
	            }
	            for (Point dot9 : bolita9) {
	                g.fillOval(dot9.x - diametro+40, dot9.y=90 + diametro*2, diametro * 2, diametro * 2);
	            }
	            for (Point dot10 : bolita10) {
	                g.fillOval(dot10.x - diametro+40, dot10.y=310 + diametro*2, diametro * 2, diametro * 2);
	            }
	            for (Point dot11 : bolita11) {
	                g.fillOval(dot11.x=160 - diametro, dot11.y + diametro*2, diametro * 2, diametro * 2);
	            }
	            for (Point dot12 : bolita12) {
	                g.fillOval(dot12.x=80 - diametro, dot12.y + diametro*2, diametro * 2, diametro * 2);
	            }
	            for (Point dot13 : bolita13) {
	                g.fillOval(dot13.x=320 - diametro, dot13.y + diametro*2, diametro * 2, diametro * 2);
	            }
	            for (Point dot13 : bolita14) {
	                g.fillOval(dot13.x=400 - diametro, dot13.y + diametro*2, diametro * 2, diametro * 2);
	            }
	        }
	    }
	

	 public class Element{
		int x,y,h,w;
		Color c;
		 
		 Element(int x,int y,int h, int w,Color c) {
			 
			 this.x=x;
			 this.y=y;
			 this.h=h;
			 this.w=w;
			 this.c=c;
			 
			 
			 
		}
		 
		 public void comer( Element e) {
		        for (int i = 0; i < bolita.size(); i++) {
		            Point dot = bolita.get(i);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot.x, 2) + Math.pow(pacman.y - dot.y, 2));
		            if (tamano < 20 + diametro) {
		                bolita.remove(i);
		                i--;
		           puntaje++;
		           
		            }
		        }
		        for (int i = 0; i < bolita2.size(); i++) {
		        	Point dot = bolita2.get(i);
		        	double tamano = Math.sqrt(Math.pow(this.x - dot.x-30, 2) + Math.pow(this.y - dot.y, 2));
		        	if (tamano < 20 + diametro) {
		        		bolita2.remove(i);
		        		i--;
		        		puntaje++;
		        	}
		        }
		        
		        for (int j = 0; j < bolita3.size(); j++) {
		            Point dot3 = bolita3.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x, 2) + Math.pow(pacman.y - dot3.y, 2));
		            if (tamano < 20 + diametro) {
		                bolita3.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita4.size(); j++) {
		            Point dot3 = bolita4.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x-30, 2) + Math.pow(pacman.y - dot3.y, 2));
		            if (tamano < 20 + diametro) {
		                bolita4.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita5.size(); j++) {
		            Point dot5 = bolita5.get(j);
		            double tamano1 = Math.sqrt(Math.pow(pacman.x - dot5.x-30, 2) + Math.pow(pacman.y - dot5.y, 2));
		            if (tamano1 < 20+diametro ) {
		                bolita5.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita6.size(); j++) {
		            Point dot3 = bolita6.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x-30, 2) + Math.pow(pacman.y - dot3.y, 2));
		            if (tamano < 20 + diametro) {
		                bolita6.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita7.size(); j++) {
		            Point dot3 = bolita7.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x-30, 2) + Math.pow(pacman.y - dot3.y, 2));
		            if (tamano < 20 + diametro) {
		                bolita7.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita8.size(); j++) {
		            Point dot3 = bolita8.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x-30, 2) + Math.pow(pacman.y - dot3.y, 2));
		            if (tamano < 20 + diametro) {
		                bolita8.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita9.size(); j++) {
		            Point dot3 = bolita9.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x-30, 2) + Math.pow(pacman.y - dot3.y+20, 2));
		            if (tamano < 20 + diametro) {
		                bolita9.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita10.size(); j++) {
		            Point dot3 = bolita10.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x-30, 2) + Math.pow(pacman.y - dot3.y+20, 2));
		            if (tamano < 20 + diametro) {
		                bolita10.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita11.size(); j++) {
		            Point dot3 = bolita11.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x+20, 2) + Math.pow(pacman.y - dot3.y+10, 2));
		            if (tamano < 20 + diametro) {
		                bolita11.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita12.size(); j++) {
		            Point dot3 = bolita12.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x+10, 2) + Math.pow(pacman.y - dot3.y-10, 2));
		            if (tamano < 20 + diametro) {
		                bolita12.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita13.size(); j++) {
		            Point dot3 = bolita13.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x-10, 2) + Math.pow(pacman.y - dot3.y-10, 2));
		            if (tamano < 20 + diametro) {
		                bolita13.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		        for (int j = 0; j < bolita14.size(); j++) {
		            Point dot3 = bolita14.get(j);
		            double tamano = Math.sqrt(Math.pow(pacman.x - dot3.x+10, 2) + Math.pow(pacman.y - dot3.y-10, 2));
		            if (tamano < 20 + diametro) {
		                bolita14.remove(j);
		                j--;
		                puntaje++;
		            }
		        }
		 
		        
		 }
		 
		 
		
		 
		 public boolean tocando(Element e) {
			 
			 if(this.x<e.x+e.w &&
			   this.x + this.w> e.x &&
			   this.y<e.y +e.h &&
			   this.y + this.h> e.y) {
				 
				 
				
				 return true;
				 
			 }
			 return false;
		 }
		 
		 public int teletransporte (Element e) {
			 
			 if(e.x <-30 ) {
				 
				 
				 return 1;
			 }else if( e.x >480) {
				 
				 return 2;
			 }
			 
			 
			 return 0;
			
		 }
		 
		 
		 
	 }
	 
	 
}
