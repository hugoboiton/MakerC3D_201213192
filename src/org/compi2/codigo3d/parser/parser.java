
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Mar 05 00:13:06 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Mar 05 00:13:06 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\007\002\000\002\002" +
    "\004\000\002\006\005\000\002\006\005\000\002\006\005" +
    "\000\002\006\004\000\002\006\005\000\002\006\003\000" +
    "\002\004\005\000\002\005\003\000\002\005\003\000\002" +
    "\005\003\000\002\005\003\000\002\005\003\000\002\005" +
    "\003\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\004\000" +
    "\002\003\005\000\002\003\003\000\002\003\003\000\002" +
    "\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\016\004\000\005\000\006\000\010\000\014" +
    "\000\026\000\001\002\000\016\004\015\005\012\006\007" +
    "\010\010\014\011\026\017\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\042\002\uffe8\007\uffe8" +
    "\010\uffe8\011\uffe8\012\uffe8\013\uffe8\015\uffe8\016\uffe8\017" +
    "\uffe8\020\uffe8\021\uffe8\022\uffe8\023\uffe8\024\uffe8\025\uffe8" +
    "\027\uffe8\001\002\000\014\004\015\005\012\006\007\010" +
    "\010\014\043\001\002\000\016\004\015\005\012\006\007" +
    "\010\010\014\011\026\017\001\002\000\042\002\uffe9\007" +
    "\uffe9\010\uffe9\011\uffe9\012\uffe9\013\uffe9\015\uffe9\016\uffe9" +
    "\017\uffe9\020\uffe9\021\uffe9\022\uffe9\023\uffe9\024\uffe9\025" +
    "\uffe9\027\uffe9\001\002\000\014\002\ufff9\015\ufff9\024\ufff9" +
    "\025\ufff9\027\ufff9\001\002\000\030\007\035\010\030\011" +
    "\033\012\040\013\032\016\031\017\027\020\037\021\036" +
    "\022\041\023\042\001\002\000\042\002\uffea\007\uffea\010" +
    "\uffea\011\uffea\012\uffea\013\uffea\015\uffea\016\uffea\017\uffea" +
    "\020\uffea\021\uffea\022\uffea\023\uffea\024\uffea\025\uffea\027" +
    "\uffea\001\002\000\012\002\uffff\024\023\025\021\027\022" +
    "\001\002\000\016\004\015\005\012\006\007\010\010\014" +
    "\011\026\017\001\002\000\014\002\ufffb\015\ufffb\024\ufffb" +
    "\025\ufffb\027\ufffb\001\002\000\016\004\015\005\012\006" +
    "\007\010\010\014\011\026\017\001\002\000\016\004\015" +
    "\005\012\006\007\010\010\014\011\026\017\001\002\000" +
    "\016\004\015\005\012\006\007\010\010\014\011\026\017" +
    "\001\002\000\014\002\ufffc\015\ufffc\024\ufffc\025\021\027" +
    "\ufffc\001\002\000\014\002\ufffe\015\ufffe\024\023\025\021" +
    "\027\ufffe\001\002\000\014\002\ufffd\015\ufffd\024\ufffd\025" +
    "\ufffd\027\ufffd\001\002\000\014\004\ufff6\005\ufff6\006\ufff6" +
    "\010\ufff6\014\ufff6\001\002\000\014\004\015\005\012\006" +
    "\007\010\010\014\043\001\002\000\014\004\ufff7\005\ufff7" +
    "\006\ufff7\010\ufff7\014\ufff7\001\002\000\014\004\015\005" +
    "\012\006\007\010\010\014\043\001\002\000\014\004\015" +
    "\005\012\006\007\010\010\014\043\001\002\000\014\004" +
    "\015\005\012\006\007\010\010\014\043\001\002\000\014" +
    "\004\015\005\012\006\007\010\010\014\043\001\002\000" +
    "\014\004\ufff4\005\ufff4\006\ufff4\010\ufff4\014\ufff4\001\002" +
    "\000\014\004\ufff5\005\ufff5\006\ufff5\010\ufff5\014\ufff5\001" +
    "\002\000\014\004\015\005\012\006\007\010\010\014\043" +
    "\001\002\000\014\004\ufff3\005\ufff3\006\ufff3\010\ufff3\014" +
    "\ufff3\001\002\000\014\004\ufff2\005\ufff2\006\ufff2\010\ufff2" +
    "\014\ufff2\001\002\000\014\004\015\005\012\006\007\010" +
    "\010\014\043\001\002\000\042\002\uffee\007\uffee\010\uffee" +
    "\011\uffee\012\uffee\013\032\015\uffee\016\uffee\017\uffee\020" +
    "\uffee\021\uffee\022\uffee\023\uffee\024\uffee\025\uffee\027\uffee" +
    "\001\002\000\016\007\035\010\030\011\033\012\040\013" +
    "\032\015\046\001\002\000\042\002\uffeb\007\uffeb\010\uffeb" +
    "\011\uffeb\012\uffeb\013\uffeb\015\uffeb\016\uffeb\017\uffeb\020" +
    "\uffeb\021\uffeb\022\uffeb\023\uffeb\024\uffeb\025\uffeb\027\uffeb" +
    "\001\002\000\042\002\ufff1\007\ufff1\010\ufff1\011\033\012" +
    "\040\013\032\015\ufff1\016\ufff1\017\ufff1\020\ufff1\021\ufff1" +
    "\022\ufff1\023\ufff1\024\ufff1\025\ufff1\027\ufff1\001\002\000" +
    "\026\002\ufff8\007\035\010\030\011\033\012\040\013\032" +
    "\015\ufff8\024\ufff8\025\ufff8\027\ufff8\001\002\000\042\002" +
    "\uffef\007\uffef\010\uffef\011\uffef\012\uffef\013\032\015\uffef" +
    "\016\uffef\017\uffef\020\uffef\021\uffef\022\uffef\023\uffef\024" +
    "\uffef\025\uffef\027\uffef\001\002\000\042\002\uffed\007\uffed" +
    "\010\uffed\011\uffed\012\uffed\013\032\015\uffed\016\uffed\017" +
    "\uffed\020\uffed\021\uffed\022\uffed\023\uffed\024\uffed\025\uffed" +
    "\027\uffed\001\002\000\042\002\ufff0\007\ufff0\010\ufff0\011" +
    "\033\012\040\013\032\015\ufff0\016\ufff0\017\ufff0\020\ufff0" +
    "\021\ufff0\022\ufff0\023\ufff0\024\ufff0\025\ufff0\027\ufff0\001" +
    "\002\000\032\007\035\010\030\011\033\012\040\013\032" +
    "\015\046\016\031\017\027\020\037\021\036\022\041\023" +
    "\042\001\002\000\012\015\056\024\023\025\021\027\022" +
    "\001\002\000\014\002\ufffa\015\ufffa\024\ufffa\025\ufffa\027" +
    "\ufffa\001\002\000\042\002\uffec\007\uffec\010\uffec\011\033" +
    "\012\040\013\032\015\uffec\016\uffec\017\uffec\020\uffec\021" +
    "\uffec\022\uffec\023\uffec\024\uffec\025\uffec\027\uffec\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\055\000\006\002\004\007\003\001\001\000\010\003" +
    "\013\004\012\006\015\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\056\001\001\000" +
    "\010\003\053\004\012\006\054\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\033\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\003\013\004\012\006\017" +
    "\001\001\000\002\001\001\000\010\003\013\004\012\006" +
    "\025\001\001\000\010\003\013\004\012\006\024\001\001" +
    "\000\010\003\013\004\012\006\023\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\052\001\001\000\002\001\001\000\004\003" +
    "\051\001\001\000\004\003\050\001\001\000\004\003\047" +
    "\001\001\000\004\003\046\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\043\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\044\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\033\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
       
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de acciones
      

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expresion ::= DECIMAL 
            {
              NodoC3D RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String decimal = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(decimal); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion ::= ENTERO 
            {
              NodoC3D RESULT =null;
		int enteroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int enteroright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String entero = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(entero); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= ID 
            {
              NodoC3D RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(id); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= MENOS expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= expresion POT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= expresion DIV expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion MULT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion MENOS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= expresion MAS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // op ::= DIFERENTE 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("!=");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // op ::= IGUALIGUAL 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("==");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // op ::= MAYORIGUAL 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D(">=");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // op ::= MAYOR 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D(">");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // op ::= MENORIGUAL 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("<=");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // op ::= MENOR 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("<");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("op",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // relacional ::= expresion op expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D p = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                   String temp = ControlC3D.generaTemp();
                   String c3d = temp + " = " + izq.getCad() + " "+p.getCad()+ " "+ der.getCad() + ";\n";
                   ControlC3D.agregarC3D(c3d);
                   RESULT = new NodoC3D(temp); 

                  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacional",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // logica ::= relacional 
            {
              NodoC3D RESULT =null;
		int releft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int reright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D re = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
             RESULT =re;
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("logica",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // logica ::= PAR_IZQ logica PAR_DER 
            {
              NodoC3D RESULT =null;
		int logleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int logright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D log = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = log; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("logica",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // logica ::= NOT logica 
            {
              NodoC3D RESULT =null;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                   String temp = ControlC3D.generaTemp();
                   String c3d = temp + " = " +"! " + der.getCad() + ";\n";
                   ControlC3D.agregarC3D(c3d);
                   RESULT = new NodoC3D(temp); 
           
              CUP$parser$result = parser.getSymbolFactory().newSymbol("logica",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // logica ::= logica XOR logica 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                   String temp = ControlC3D.generaTemp();
                   String c3d = temp + " = " + izq.getCad() + " &|"+ der.getCad() + ";\n";
                   ControlC3D.agregarC3D(c3d);
                   RESULT = new NodoC3D(temp); 

            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("logica",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // logica ::= logica AND logica 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                   String temp = ControlC3D.generaTemp();
                   String c3d = temp + " = " + izq.getCad() + " && "+ der.getCad() + ";\n";
                   ControlC3D.agregarC3D(c3d);
                   RESULT = new NodoC3D(temp); 

            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("logica",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // logica ::= logica OR logica 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                   String temp = ControlC3D.generaTemp();
                   String c3d = temp + " = " + izq.getCad() + " || "+ der.getCad() + ";\n";
                   ControlC3D.agregarC3D(c3d);
                   RESULT = new NodoC3D(temp); 

            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("logica",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 logica 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int logleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int logright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D log = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   
                        RESULT = log;
                        ControlC3D.agregarC3D("//Último valor: " + log.getCad());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
