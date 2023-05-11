package src;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UI extends Physics {
    // Shared components
    JFrame mainFrame;
    JLabel pageHeading;

    JTextField firstValue;
    JLabel firstValueLabel;

    JTextField secondValue;
    JLabel secondValueLabel;

    JTextField thirdValue;
    JLabel thirdValueLabel;

    JButton calculateBtn;

    // Functions
    Physics physics = new Physics();

    // Main page components
    JButton kineticBtn;
    JButton potentialBtn;
    JButton momentumBtn;

    // Result components
    JLabel resultLabel;
    JButton resultCloseBtn;

    final JPanel mainOptionPanel = new JPanel();

    // Kinetic page components
    final JPanel kineticPanel = new JPanel();

    // Result page components
    final JPanel resultPanel = new JPanel();

    public UI() {
        // Initialize the mainFrame
        mainFrame = new JFrame("Physics Calculator");
        mainFrame.setLayout(new GridLayout(2, 1));

        // Page heading
        pageHeading = new JLabel("Select calculation to perform", SwingConstants.CENTER);

        // Define components (3 buttons)
        kineticBtn = new JButton("Kinetic Energy");
        potentialBtn = new JButton("Potential Energy");
        momentumBtn = new JButton("Linear Momentum");

        // Add components functionality
        kineticBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                KineticUI();
            }
        });

        // Add components to mainOptionsPanel
        mainOptionPanel.add(kineticBtn);
        mainOptionPanel.add(potentialBtn);
        mainOptionPanel.add(momentumBtn);

        // Add panels to the mainFrame
        mainFrame.add(pageHeading);
        mainFrame.add(mainOptionPanel);

        // Set mainFrame prefferrences
        mainFrame.setPreferredSize(new Dimension(500, 200));
        mainFrame.pack();
        mainFrame.setResizable(false);

        // Display mainFrame
        mainFrame.setVisible(true);
    }

    // Display Kinetic page
    public void KineticUI() {
        // Hide mainOptionPanel & set new heading
        mainOptionPanel.setVisible(false);

        pageHeading.setText("Please provide values:");

        // Define components (3 textField & 1 Button)
        firstValueLabel = new JLabel("Mass (g)");
        firstValue = new JTextField("", 3);
        firstValue.setPreferredSize(new Dimension(5, 25));

        secondValueLabel = new JLabel("Velocity (m/s)");
        secondValue = new JTextField("", 3);
        secondValue.setPreferredSize(new Dimension(5, 25));

        calculateBtn = new JButton("CALCULATE");
        calculateBtn.setPreferredSize(new Dimension(120, 25));

        // Perform calculation
        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String massString = firstValue.getText();
                Float mass = Float.parseFloat(massString);

                String velocityString = secondValue.getText();
                Float velocity = Float.parseFloat(velocityString);
                Float result = physics.getKineticEnergy(mass, velocity);

                ResultUI(result, "kinetic");
            }
        });

        kineticPanel.setLayout(new FlowLayout());

        // Add components to kineticPanel
        kineticPanel.add(firstValueLabel);
        kineticPanel.add(firstValue);

        kineticPanel.add(secondValueLabel);
        kineticPanel.add(secondValue);

        kineticPanel.add(calculateBtn);

        // Add kineticPanel to mainFrame
        kineticPanel.setLayout(new FlowLayout());
        mainFrame.add(kineticPanel);
        mainFrame.setLayout(new GridLayout(4, 1));

        // Display kineticPanel
        kineticPanel.setVisible(true);
    }

    public void ResultUI(Float result, String invoker) {
        pageHeading.setText("Results:");

        if (invoker == "kinetic") {
            kineticPanel.setVisible(false);
            String stringResult = Float.toString(result) + " m/s square";
            resultLabel = new JLabel(stringResult);
        }

        resultPanel.add(resultLabel);
        resultPanel.add(resultCloseBtn);
        resultPanel.setLayout(new FlowLayout());
        mainFrame.add(resultPanel);
        mainFrame.setLayout(new GridLayout(5, 1));
    }
}
