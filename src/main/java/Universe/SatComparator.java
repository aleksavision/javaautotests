package Universe;

import com.google.common.collect.ComparisonChain;

import java.util.Comparator;

public class SatComparator implements Comparator<Saturn> {

//    @Override
//    public int compare(Saturn sat1, Saturn sat2) {
//        if (sat1.oldData == sat2.oldData) {
//            return 0;
//            }
//        if (sat1.oldData > sat2.oldData){
//            return 1;
//            }
//        else {
//            return -1;
//        }
//
//    }


//    @Override
//    public int compare(Saturn sat1, Saturn sat2) {
//        int result;
//        if ((result = Integer.compare(sat1.oldData, sat2.oldData)) == 0 &&
//                (result = sat1.ground.compareTo(sat2.ground)) == 0) ;
//        return result;
//    }

    @Override
    public int compare(Saturn sat1, Saturn sat2){
        return ComparisonChain.start()
                .compare(sat1.newData, sat2.newData)
                .compare(sat1.ground, sat2.ground)
                .result();
    }









}
