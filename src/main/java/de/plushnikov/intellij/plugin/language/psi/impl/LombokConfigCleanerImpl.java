// This is a generated file. Not intended for manual editing.
package de.plushnikov.intellij.plugin.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigCleaner;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigPsiUtil;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigVisitor;
import org.jetbrains.annotations.NotNull;

public class LombokConfigCleanerImpl extends ASTWrapperPsiElement implements LombokConfigCleaner {

  public LombokConfigCleanerImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LombokConfigVisitor) {
      ((LombokConfigVisitor) visitor).visitCleaner(this);
    } else {
      super.accept(visitor);
    }
  }

  public String getKey() {
    return LombokConfigPsiUtil.getKey(this);
  }

}