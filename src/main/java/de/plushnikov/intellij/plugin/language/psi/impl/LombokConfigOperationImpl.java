// This is a generated file. Not intended for manual editing.
package de.plushnikov.intellij.plugin.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigOperation;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigVisitor;
import org.jetbrains.annotations.NotNull;

public class LombokConfigOperationImpl extends ASTWrapperPsiElement implements LombokConfigOperation {

  public LombokConfigOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LombokConfigVisitor) {
      ((LombokConfigVisitor) visitor).visitOperation(this);
    } else {
      super.accept(visitor);
    }
  }

}