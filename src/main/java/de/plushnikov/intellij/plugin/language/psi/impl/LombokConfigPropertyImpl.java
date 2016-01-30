// This is a generated file. Not intended for manual editing.
package de.plushnikov.intellij.plugin.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigOperation;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigProperty;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigPsiUtil;
import de.plushnikov.intellij.plugin.language.psi.LombokConfigVisitor;
import org.jetbrains.annotations.NotNull;

public class LombokConfigPropertyImpl extends ASTWrapperPsiElement implements LombokConfigProperty {

  public LombokConfigPropertyImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public LombokConfigOperation getOperation() {
    return findNotNullChildByClass(LombokConfigOperation.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LombokConfigVisitor) {
      ((LombokConfigVisitor) visitor).visitProperty(this);
    } else {
      super.accept(visitor);
    }
  }

  public String getKey() {
    return LombokConfigPsiUtil.getKey(this);
  }

  public String getValue() {
    return LombokConfigPsiUtil.getValue(this);
  }

}