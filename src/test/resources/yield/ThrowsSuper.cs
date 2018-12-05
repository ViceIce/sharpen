using System.Collections;

namespace yield {
    public sealed class ThrowsSuper {
        public class Base {
            public virtual IEnumerator test() {
                yield break;
            }
        }

        public class Child : yield.ThrowsSuper.Base {
            public override IEnumerator test() {
                yield return base.test();
                yield break;
            }
        }
    }
}