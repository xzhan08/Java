/*
* GraphicsSiwng.java
*
* This is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation v3.
*
* @see <a href="http://www.gnu.org/licenses/gpl.html">GNU License</a> for more information.
*
* Copyright (c) Joan Seculi <a href="mailto:joan.seculi@gmail.com">Joan Seculi</a>
*/
package a12_31_graphic1Square1;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * GraphicsSiwng.java - Pattern explorer for graphics 1 to 8.
 *
 * <p>Lets the user choose the graphic type, the number of lines and the
 * character, and draws the selected pattern in a monospaced output area.</p>
 */
public class GraphicsSwing extends JFrame {

    private static final Color PRIMARY = new Color(29, 78, 216);
    private static final Color PRIMARY_DARK = new Color(30, 64, 175);
    private static final Color HEADER_START = new Color(15, 23, 42);
    private static final Color HEADER_END = new Color(29, 78, 216);
    private static final Color PRIMARY_SOFT = new Color(239, 246, 255);
    private static final Color PRIMARY_BORDER = new Color(191, 219, 254);
    private static final Color BG = new Color(248, 250, 252);
    private static final Color SURFACE = Color.WHITE;
    private static final Color BORDER = new Color(226, 232, 240);
    private static final Color INK = new Color(15, 23, 42);
    private static final Color MUTED = new Color(100, 116, 139);
    private static final Color FAINT = new Color(148, 163, 184);
    private static final Color DANGER = new Color(220, 38, 38);
    private static final Color WARNING = new Color(217, 119, 6);

    private static final String[] TYPE_NAMES = {
        "1 - Square",
        "2 - Square with spaces",
        "3 - Ascending triangle",
        "4 - Ascending triangle (right)",
        "5 - Descending triangle",
        "6 - Descending triangle (right)",
        "7 - Pyramid",
        "8 - Rhombus",
        "9 - Pyramid with random characters"
    };

    private static final String[] TYPE_DESCRIPTIONS = {
        "Solid square of lines x lines.",
        "Square where every character is followed by a space.",
        "Left-aligned triangle growing one character per line.",
        "Right-aligned triangle growing one character per line.",
        "Left-aligned triangle shrinking one character per line.",
        "Right-aligned triangle shrinking one character per line.",
        "Centered pyramid with an odd number of characters per line.",
        "Rhombus made of an upper half and a lower half.",
        "Pyramid with random characters from +~ox*O with a star on top."
    };

    private static final String[] STAR_NAMES = {
        "Black Star (鈽�)",
        "White Star (鈽�)",
        "White Medium Star (猸�)"
    };

    private static final char[] STAR_CHARS = {
        '\u2605',
        '\u2606',
        '\u2B50'
    };

    private final JComboBox<String> typeCombo;
    private final JSpinner linesSpinner;
    private final JTextField charField;
    private final JComboBox<String> starCombo;
    private final JTextArea outputArea;
    private final JScrollPane outputScroll;
    private final JButton drawButton;
    private final JButton clearButton;
    private final JLabel descriptionLabel = new JLabel(" ");
    private final JLabel detailsLabel = new JLabel(" ");
    private final JLabel errorLabel = new JLabel(" ");

    public GraphicsSwing() {
        typeCombo = createTypeCombo();
        linesSpinner = createLinesSpinner();
        charField = createCharField("e.g. *");
        starCombo = createStarCombo();
        outputArea = createOutputArea();
        outputScroll = createOutputScrollPane();
        drawButton = createStyledButton("DRAW", PRIMARY, Color.WHITE, false);
        clearButton = createStyledButton("CLEAR", PRIMARY_DARK, PRIMARY_DARK, true);

        typeCombo.setName("typeCombo");
        linesSpinner.setName("linesSpinner");
        charField.setName("charField");
        starCombo.setName("starCombo");
        outputArea.setName("outputArea");
        outputScroll.setName("outputScroll");
        drawButton.setName("drawButton");
        clearButton.setName("clearButton");
        descriptionLabel.setName("descriptionLabel");
        detailsLabel.setName("detailsLabel");
        errorLabel.setName("errorLabel");

        setTitle("Pattern Explorer \u00B7 12.38");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setMinimumSize(new Dimension(900, 720));

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(BG);
        root.add(createHeaderPanel(), BorderLayout.NORTH);
        root.add(createBody(), BorderLayout.CENTER);

        setContentPane(root);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        typeCombo.addActionListener(e -> updateDescription());
        drawButton.addActionListener(e -> doDraw());
        clearButton.addActionListener(e -> doClear());
        charField.addActionListener(e -> doDraw());

        updateDescription();
        resetOutputs();
        SwingUtilities.invokeLater(() -> charField.requestFocusInWindow());
    }

    private String buildSquare1(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic1Square1.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildSquare1";
        str = "";
		
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < lines; j++) {
				str += c;
			}
			str += "\n";
		}
        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildSquare2(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic2Square2.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildSquare2";

        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildAscendingTriangle1(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic3AscendingTriangle1.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildAscendingTriangle1";

        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildAscendingTriangle2(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic4AscendingTriangle2.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildAscendingTriangle2";

        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildDescendingTriangle1(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic5DescendingTriangle1.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildDescendingTriangle1";

        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildDescendingTriangle2(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic6DescendingTriangle2.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildDescendingTriangle2";

        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildPyramid(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic7Pyramid.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildPyramid";

        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildRhombus(int lines, char c) {
        // ==================================================================
        // >>> INICI PART DE L'ALUMNE <<<
        //
        // Aqui has de traslladar el codi que vas fer a Graphic8Rhombus.java.
        //
        // Substitueix el return null per retornar el text que forma el rombe.
        // ==================================================================

        String str = "Complete the method buildRhombus";

        return str;
        // ==================================================================
        // >>> FI PART DE L'ALUMNE <<<
        // ==================================================================
    }

    private String buildPyramidRandoms(int lines, char star) {
        // >>> INICI PART DE L'ALUMNE <<<
        //
    	// Aqui has de traslladar el codi que vas fer a Graphic9PyramidRandom.java.
        // Implementa la piramide amb caracters aleatoris.
        // Utilitza String letters = "+~ox*O"; i un Random entre 0 i 5.
        // La primera linia ha de ser l'estrella seleccionada.
        // Substitueix el return null per la teva implementacio.
        // >>> FI PART DE L'ALUMNE <<<

        String str = "Complete the method buildPyramidRandoms";

        return str;
    }
    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout(24, 0)) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setPaint(new GradientPaint(0, 0, HEADER_START, getWidth(), getHeight(), HEADER_END));
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.setColor(new Color(255, 255, 255, 16));
                g2.fillOval(getWidth() - 240, -90, 280, 280);
                g2.dispose();
            }
        };
        header.setOpaque(false);
        header.setBorder(new EmptyBorder(16, 28, 16, 28));

        JPanel texts = new JPanel();
        texts.setOpaque(false);
        texts.setLayout(new BoxLayout(texts, BoxLayout.Y_AXIS));

        JLabel badge = new JLabel("EXERCISE 12.38");
        badge.setFont(new Font("Segoe UI", Font.BOLD, 10));
        badge.setForeground(new Color(219, 234, 254));
        badge.setBorder(new CompoundBorder(
                new LineBorder(new Color(191, 219, 254, 130), 1, true),
                new EmptyBorder(3, 10, 3, 10)));
        badge.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel title = new JLabel("Pattern Explorer");
        title.setFont(new Font("Segoe UI", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel subtitle = new JLabel(
                "Graphics 1 - 8 \u00B7 squares, triangles, pyramids and rhombuses");
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        subtitle.setForeground(new Color(219, 234, 254));
        subtitle.setAlignmentX(Component.LEFT_ALIGNMENT);

        texts.add(badge);
        texts.add(Box.createVerticalStrut(7));
        texts.add(title);
        texts.add(Box.createVerticalStrut(3));
        texts.add(subtitle);

        header.add(texts, BorderLayout.CENTER);
        header.add(new PatternBadge(), BorderLayout.EAST);

        return header;
    }

    private JComponent createBody() {
        JPanel body = new JPanel(new BorderLayout());
        body.setBackground(BG);
        body.setBorder(new EmptyBorder(18, 26, 22, 26));

        JPanel row = new JPanel(new GridBagLayout());
        row.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 0, 18);
        row.add(createInputCard(), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.insets = new Insets(0, 0, 0, 0);
        row.add(createResultsCard(), gbc);

        body.add(row, BorderLayout.CENTER);

        return body;
    }

    private JPanel createInputCard() {
        CardPanel card = new CardPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new EmptyBorder(18, 18, 18, 18));
        card.setPreferredSize(new Dimension(430, 460));
        card.setMinimumSize(new Dimension(360, 0));

        JLabel tag = new JLabel("INPUT");
        tag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        tag.setForeground(PRIMARY);
        tag.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel heading = new JLabel("Pattern settings");
        heading.setFont(new Font("Segoe UI", Font.BOLD, 18));
        heading.setForeground(INK);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel hint = new JLabel("Choose a graphic and customise it.");
        hint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        hint.setForeground(MUTED);
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);

        card.add(tag);
        card.add(Box.createVerticalStrut(8));
        card.add(heading);
        card.add(Box.createVerticalStrut(2));
        card.add(hint);
        card.add(Box.createVerticalStrut(14));

        card.add(createFieldLabel("GRAPHIC TYPE"));
        card.add(typeCombo);
        card.add(Box.createVerticalStrut(12));

        JPanel fieldsRow = new JPanel(new GridLayout(1, 2, 12, 0));
        fieldsRow.setOpaque(false);
        fieldsRow.setAlignmentX(Component.LEFT_ALIGNMENT);
        fieldsRow.setMaximumSize(new Dimension(Integer.MAX_VALUE, 64));
        fieldsRow.add(createFieldColumn("LINES", linesSpinner));
        fieldsRow.add(createFieldColumn("CHARACTER", charField));
        card.add(fieldsRow);
        card.add(Box.createVerticalStrut(12));

        card.add(createFieldColumn("STAR", starCombo));
        card.add(Box.createVerticalStrut(12));

        card.add(createDescriptionPanel());
        card.add(Box.createVerticalStrut(8));

        errorLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
        errorLabel.setForeground(DANGER);
        errorLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(errorLabel);

        card.add(Box.createVerticalGlue());
        card.add(fullWidth(drawButton, 44));
        card.add(Box.createVerticalStrut(8));
        card.add(fullWidth(clearButton, 38));
        card.add(Box.createVerticalStrut(10));

        JLabel methodsHint = new JLabel(
                "<html>Student method: <b>buildRhombus(int, char)</b></html>");
        methodsHint.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        methodsHint.setForeground(FAINT);
        methodsHint.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(methodsHint);

        return card;
    }

    private JPanel createFieldColumn(String label, JComponent field) {
        JPanel column = new JPanel();
        column.setOpaque(false);
        column.setLayout(new BoxLayout(column, BoxLayout.Y_AXIS));
        column.add(createFieldLabel(label));
        column.add(field);
        return column;
    }

    private JLabel createFieldLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Segoe UI", Font.BOLD, 12));
        label.setForeground(MUTED);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        label.setBorder(new EmptyBorder(0, 0, 5, 0));
        return label;
    }

    private JPanel createDescriptionPanel() {
        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setBackground(PRIMARY_SOFT);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 58));
        panel.setBorder(new CompoundBorder(
                new LineBorder(PRIMARY_BORDER, 1, true),
                new EmptyBorder(8, 12, 8, 12)));

        JLabel tag = new JLabel("DESCRIPTION");
        tag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        tag.setForeground(PRIMARY_DARK);
        tag.setAlignmentX(Component.LEFT_ALIGNMENT);

        descriptionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        descriptionLabel.setForeground(INK);
        descriptionLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel.add(tag);
        panel.add(Box.createVerticalStrut(3));
        panel.add(descriptionLabel);

        return panel;
    }

    private JPanel createResultsCard() {
        CardPanel card = new CardPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBorder(new EmptyBorder(18, 18, 18, 18));
        card.setPreferredSize(new Dimension(360, 460));
        card.setMinimumSize(new Dimension(360, 0));

        JLabel tag = new JLabel("RESULT");
        tag.setFont(new Font("Segoe UI", Font.BOLD, 10));
        tag.setForeground(FAINT);
        tag.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel heading = new JLabel("Pattern");
        heading.setFont(new Font("Segoe UI", Font.BOLD, 18));
        heading.setForeground(INK);
        heading.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel hint = new JLabel("The generated pattern appears here.");
        hint.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        hint.setForeground(MUTED);
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);

        card.add(tag);
        card.add(Box.createVerticalStrut(8));
        card.add(heading);
        card.add(Box.createVerticalStrut(2));
        card.add(hint);
        card.add(Box.createVerticalStrut(12));

        card.add(outputScroll);
        card.add(Box.createVerticalStrut(10));

        detailsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        detailsLabel.setForeground(MUTED);
        detailsLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(detailsLabel);

        JLabel footer = new JLabel("Monospaced output \u00B7 scroll to see large patterns.");
        footer.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        footer.setForeground(FAINT);
        footer.setAlignmentX(Component.LEFT_ALIGNMENT);
        card.add(Box.createVerticalStrut(6));
        card.add(footer);

        return card;
    }

    private JComponent fullWidth(JButton button, int height) {
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setPreferredSize(new Dimension(320, height));
        button.setMinimumSize(new Dimension(0, height));
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        return button;
    }

    private Border createFieldBorder(boolean error) {
        Color color = error ? DANGER : BORDER;
        int thickness = error ? 2 : 1;
        return new CompoundBorder(
                new LineBorder(color, thickness, true),
                new EmptyBorder(6, 10, 6, 10));
    }

    private void clearInputErrors() {
        charField.setBorder(createFieldBorder(false));
        errorLabel.setText(" ");
    }

    private void updateDescription() {
        int index = typeCombo.getSelectedIndex();
        if (index >= 0 && index < TYPE_DESCRIPTIONS.length) {
            descriptionLabel.setText(TYPE_DESCRIPTIONS[index]);
        }
    }

    private void doDraw() {
        resetOutputs();
        clearInputErrors();

        int type = typeCombo.getSelectedIndex() + 1;
        int lines = (Integer) linesSpinner.getValue();
        char c;

        if (type == 9) {
            c = STAR_CHARS[starCombo.getSelectedIndex()];
        } else {
            String charText = charField.getText().trim();
            if (charText.isEmpty()) {
                showError("Enter a character");
                return;
            }
            c = charText.charAt(0);
        }
        String pattern = buildPattern(type, lines, c);

        if (pattern == null) {
            outputArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 16));
            outputArea.setForeground(WARNING);
            outputArea.setText("Complete buildRhombus(...)");
            outputArea.setCaretPosition(0);
            detailsLabel.setText("Implement the student method to see the rhombus.");
            return;
        }

        outputArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        outputArea.setForeground(INK);
        outputArea.setText(pattern);
        outputArea.setCaretPosition(0);
        detailsLabel.setText(TYPE_NAMES[type - 1] + " \u00B7 " + lines
                + " lines using '" + c + "'");
    }

    private void doClear() {
        typeCombo.setSelectedIndex(0);
        linesSpinner.setValue(5);
        starCombo.setSelectedIndex(0);
        charField.setText("");
        resetOutputs();
        clearInputErrors();
        updateDescription();
        charField.requestFocusInWindow();
    }

    private void resetOutputs() {
        outputArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        outputArea.setForeground(INK);
        outputArea.setText(" ");
        detailsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        detailsLabel.setForeground(MUTED);
        detailsLabel.setText("Choose a graphic and press Draw.");
        errorLabel.setText(" ");
    }

    private void showError(String message) {
        errorLabel.setText(message);
        charField.setBorder(createFieldBorder(true));
        charField.requestFocusInWindow();
        outputArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        outputArea.setForeground(FAINT);
        outputArea.setText(" ");
        detailsLabel.setText(" ");
    }

    private String buildPattern(int type, int lines, char c) {
        switch (type) {
            case 1:
                return buildSquare1(lines, c);
            case 2:
                return buildSquare2(lines, c);
            case 3:
                return buildAscendingTriangle1(lines, c);
            case 4:
                return buildAscendingTriangle2(lines, c);
            case 5:
                return buildDescendingTriangle1(lines, c);
            case 6:
                return buildDescendingTriangle2(lines, c);
            case 7:
                return buildPyramid(lines, c);
            case 8:
                return buildRhombus(lines, c);
            case 9:
                return buildPyramidRandoms(lines, c);
            default:
                return "";
        }
    }

    

    private JComboBox<String> createTypeCombo() {
        JComboBox<String> combo = new JComboBox<>(TYPE_NAMES);
        combo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        combo.setBackground(SURFACE);
        combo.setForeground(INK);
        combo.setBorder(new CompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(4, 8, 4, 8)));
        combo.setPreferredSize(new Dimension(0, 42));
        combo.setMinimumSize(new Dimension(0, 42));
        combo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        combo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return combo;
    }

    private JSpinner createLinesSpinner() {
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(5, 1, 50, 1));
        spinner.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        spinner.setBorder(new CompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(4, 6, 4, 6)));
        spinner.setPreferredSize(new Dimension(0, 42));
        spinner.setMinimumSize(new Dimension(0, 42));
        spinner.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));

        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) spinner.getEditor();
        editor.getTextField().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        editor.getTextField().setForeground(INK);
        editor.getTextField().setHorizontalAlignment(JTextField.CENTER);
        editor.getTextField().setBorder(new EmptyBorder(2, 2, 2, 2));
        return spinner;
    }

    private JTextField createCharField(String placeholder) {
        JTextField field = new JTextField() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (getText().isEmpty() && !hasFocus()) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    g2.setColor(FAINT);
                    g2.setFont(getFont().deriveFont(Font.ITALIC));
                    Insets insets = getInsets();
                    g2.drawString(placeholder, insets.left + 5, getHeight() / 2 + 5);
                    g2.dispose();
                }
            }
        };
        field.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        field.setForeground(INK);
        field.setCaretColor(PRIMARY_DARK);
        field.setBackground(SURFACE);
        field.setBorder(createFieldBorder(false));
        field.setPreferredSize(new Dimension(0, 42));
        field.setMinimumSize(new Dimension(0, 42));
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        field.setAlignmentX(Component.LEFT_ALIGNMENT);

        ((AbstractDocument) field.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                if (string == null) {
                    return;
                }
                if (fb.getDocument().getLength() + string.length() <= 1) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr)
                    throws BadLocationException {
                if (string == null) {
                    string = "";
                }
                int newLength = fb.getDocument().getLength() - length + string.length();
                if (newLength <= 1) {
                    super.replace(fb, offset, length, string, attr);
                }
            }
        });
        return field;
    }

    private JComboBox<String> createStarCombo() {
        JComboBox<String> combo = new JComboBox<>(STAR_NAMES);
        combo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        combo.setBackground(SURFACE);
        combo.setForeground(INK);
        combo.setBorder(new CompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(4, 8, 4, 8)));
        combo.setPreferredSize(new Dimension(0, 42));
        combo.setMinimumSize(new Dimension(0, 42));
        combo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        combo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return combo;
    }

    private JTextArea createOutputArea() {
        JTextArea area = new JTextArea(" ");
        area.setEditable(false);
        area.setLineWrap(false);
        area.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        area.setForeground(INK);
        area.setBackground(SURFACE);
        area.setCaretColor(PRIMARY_DARK);
        area.setBorder(new EmptyBorder(10, 12, 10, 12));
        area.setAlignmentX(Component.LEFT_ALIGNMENT);
        return area;
    }

    private JScrollPane createOutputScrollPane() {
        JScrollPane scroll = new JScrollPane(outputArea);
        scroll.setAlignmentX(Component.LEFT_ALIGNMENT);
        scroll.setBackground(SURFACE);
        scroll.getViewport().setBackground(SURFACE);
        scroll.setPreferredSize(new Dimension(460, 380));
        scroll.setMinimumSize(new Dimension(200, 220));
        scroll.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        scroll.setBorder(new CompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(1, 1, 1, 1)));
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.getHorizontalScrollBar().setUnitIncrement(16);
        return scroll;
    }

    private static JButton createStyledButton(String text, Color color, Color foreground, boolean outline) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                int w = getWidth();
                int h = getHeight();
                int arc = 12;

                if (outline) {
                    if (isEnabled() && getModel().isRollover()) {
                        g2.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 18));
                        g2.fillRoundRect(0, 0, w - 1, h - 1, arc, arc);
                    }
                    g2.setColor(isEnabled() ? color : FAINT);
                    g2.setStroke(new BasicStroke(1.5f));
                    g2.drawRoundRect(1, 1, w - 3, h - 3, arc, arc);
                } else {
                    Color base = isEnabled() ? color : new Color(203, 213, 225);
                    if (isEnabled() && getModel().isPressed()) {
                        base = color.darker();
                    } else if (isEnabled() && getModel().isRollover()) {
                        base = color.brighter();
                    }
                    g2.setColor(new Color(0, 0, 0, 26));
                    g2.fillRoundRect(0, 3, w, h - 3, arc, arc);
                    g2.setColor(base);
                    g2.fillRoundRect(0, 0, w, h - 3, arc, arc);
                }

                g2.dispose();
                super.paintComponent(g);
            }
        };
        button.setFont(new Font("Segoe UI", Font.BOLD, 12));
        button.setForeground(foreground);
        button.setBorder(new EmptyBorder(9, 12, 11, 12));
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setRolloverEnabled(true);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return button;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }

        SwingUtilities.invokeLater(() -> new GraphicsSwing().setVisible(true));
    }

    private static final class CardPanel extends JPanel {

        CardPanel() {
            setOpaque(false);
            setBorder(new EmptyBorder(16, 18, 16, 18));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            g2.setColor(new Color(15, 23, 42, 20));
            g2.fillRoundRect(3, 5, w - 6, h - 7, 20, 20);

            g2.setColor(SURFACE);
            g2.fillRoundRect(0, 0, w - 6, h - 7, 20, 20);

            g2.setColor(BORDER);
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 7, h - 8, 20, 20);

            g2.dispose();
        }
    }

    private static final class PatternBadge extends JPanel {

        PatternBadge() {
            setOpaque(false);
            setPreferredSize(new Dimension(124, 82));
            setMinimumSize(new Dimension(124, 82));
            setMaximumSize(new Dimension(124, 82));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                    RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            g2.setColor(new Color(255, 255, 255, 30));
            g2.fillRoundRect(0, 0, w - 1, h - 1, 20, 20);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.setStroke(new BasicStroke(1f));
            g2.drawRoundRect(0, 0, w - 1, h - 1, 20, 20);

            int cx = w / 2;
            int cy = 34;
            int size = 22;
            int[] xs = {cx, cx + size, cx, cx - size};
            int[] ys = {cy - size, cy, cy + size, cy};
            g2.setColor(new Color(255, 255, 255, 210));
            g2.fillPolygon(xs, ys, 4);
            g2.setColor(Color.WHITE);
            g2.setStroke(new BasicStroke(1.5f));
            g2.drawPolygon(xs, ys, 4);

            g2.setFont(new Font("Segoe UI", Font.BOLD, 10));
            g2.setColor(new Color(219, 234, 254));
            FontMetrics fm = g2.getFontMetrics();
            String label = "1 - 9";
            g2.drawString(label, (w - fm.stringWidth(label)) / 2, 72);

            g2.dispose();
        }
    }
}