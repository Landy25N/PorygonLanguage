/* Generated by JTB 1.4.11 */
package Porygon.syntaxtree;

import Porygon.visitor.*;

public class Start implements INode {

  public Expression f0;

  public NodeToken f1;

  private static final long serialVersionUID = 1411L;

  public Start(final Expression n0, final NodeToken n1) {
    f0 = n0;
    f1 = n1;
  }

  @Override
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  @Override
  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  @Override
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
