using System.Collections;

namespace yield {
    public sealed class Throws {
        public IEnumerator test() {
            if (true) {
                yield break;
            }
            yield return test2(123);
            yield break;
        }

        public IEnumerator test2(int x) {
            yield break;
        }
    }
}