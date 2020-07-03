public class MyVisitor extends sqlParserBaseVisitor<Object>{

    @Override public Object visitSentencia(sqlParser.SentenciaContext ctx) { return visitChildren(ctx);}
    @Override public Object visitSelect(sqlParser.SelectContext ctx) {
        System.out.println("SELECT  ");
        System.out.println("COLUMNA "+ ctx.column().columna().get(0).ID());
        System.out.println("FROM");
        System.out.println("TABLA: "+ ctx.tabla().ID().toString());
        System.out.println("WHERE: "+ ctx.opcion().where().clausula().condicion(0).ID().toString()+"="+
                ctx.opcion().where().clausula().condicion(0).var().STRING().toString());
        System.out.println("WHERE: "+ ctx.opcion().where().clausula().condicion(1).ID().toString()+"="+
                ctx.opcion().where().clausula().condicion(1).var().STRING().toString());
        return visitChildren(ctx);
    }
    @Override public Object visitCreate_table(sqlParser.Create_tableContext ctx) {
        System.out.println("nombre de la nueva tabla : "+ctx.ID().toString());
        return visitChildren(ctx);
    }
    @Override public Object visitDelete(sqlParser.DeleteContext ctx) {
        return visitChildren(ctx);
    }

}
