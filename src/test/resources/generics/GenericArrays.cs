using System.Collections.Generic;

namespace generics {
    public class GenericArrays<T> {
        private IList<T>[] genListArray = (IList<T>[])new IList<T>[0];

        private IDictionary<T, string>[] genMapArray = (IDictionary<T, string>[])new IDictionary<T, string>[0];

        private IDictionary<T, T>[] genMapArray2 = (IDictionary<T, T>[])new IDictionary<T, T>[0];

        private IList<T[]>[] genArrayList = (IList<T[]>[])new IList<T[]>[0];

        private IList<T[][]>[] genArrayList2 = (IList<T[][]>[])new IList<T[][]>[0];

        private T[] genericArray1 = (T[])new T[0];

        private T[][] genericArray2 = (T[][])new T[][] {  };

        private T[][][] genericArray3 = (T[][][])new T[][][] {  };
    }
}