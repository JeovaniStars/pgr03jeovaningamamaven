package br.com.ifba;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ImageButtonRenderer extends DefaultTableCellRenderer {
    private final ImageIcon icon;

    public ImageButtonRenderer(String imagePath) {
        this.icon = new ImageIcon(getClass().getResource(imagePath));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JButton button = new JButton(icon);
        button.setOpaque(true);
        return button;
    }
}
