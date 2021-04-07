package org.kooni_boop.movefaster

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys

class MoveFasterActionUpWithSelection : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.getData(CommonDataKeys.EDITOR) ?: return;
        val caretModel = editor.caretModel

        caretModel.moveCaretRelatively(0, -5, true, false, true)
    }
}