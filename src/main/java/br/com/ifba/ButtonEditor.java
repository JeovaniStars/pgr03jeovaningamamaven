/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class ButtonEditor extends AbstractCellEditor implements TableCellEditor {
    private final JButton button;
    private final ActionListener action;

    public ButtonEditor(ActionListener action) {
        this.button = new JButton();
        this.action = action;
        button.addActionListener(e -> {
            action.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
            stopCellEditing();
        });
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return button;
    }
}

