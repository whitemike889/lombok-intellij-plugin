// This is a generated file. Not intended for manual editing.
package de.plushnikov.intellij.plugin.language.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface LombokConfigProperty extends PsiElement {

  @NotNull
  LombokConfigOperation getOperation();

  String getKey();

  String getValue();

}