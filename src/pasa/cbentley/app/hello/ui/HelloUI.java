package pasa.cbentley.app.hello.ui;

import pasa.cbentley.app.hello.ctx.HelloCtx;

public class HelloUI {

   protected final HelloCtx hc;

   public HelloUI(HelloCtx hc) {
      this.hc = hc;
   }
   
   public void startCommandLine() {
      System.out.println("Hello Ctx!");

      //#debug
      System.out.println("Hello Ctx! #debug");
   }
}
