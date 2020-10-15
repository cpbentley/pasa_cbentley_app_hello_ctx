package pasa.cbentley.app.hello.ctx;

import pasa.cbentley.core.src4.ctx.ACtx;
import pasa.cbentley.core.src4.ctx.UCtx;

public class HelloCtx extends ACtx {

   public HelloCtx(UCtx uc) {
      super(uc);
   }
   public int getCtxID() {
      return 133;
   }
}
