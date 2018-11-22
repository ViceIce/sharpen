package sharpen.core.csharp.ast;

public class CSYieldReturnStatement extends CSExpression {

    private CSExpression _expression;

    public CSYieldReturnStatement(CSExpression expression) {
        _expression = expression;
    }

    public CSExpression expression() {
        return _expression;
    }

    public void accept(CSVisitor visitor) {
        visitor.visit(this);
    }
}
