package pasa.cbentley.app.hello.run;

import pasa.cbentley.app.hello.ctx.HelloCtx;
import pasa.cbentley.app.hello.ui.HelloUI;
import pasa.cbentley.core.src4.ctx.UCtx;

public class RunHelloCtx {

   public static void main(String[] args) {
      
      UCtx uc = new UCtx();
      HelloCtx hc = new HelloCtx(uc);
      HelloUI helloUI = new HelloUI(hc);
      helloUI.startCommandLine();
   }
}
