package org.apdplat.word.wordSeg;

import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.SegmentationAlgorithm;
import org.apdplat.word.segmentation.Word;
import org.apdplat.word.tagging.PartOfSpeechTagging;

import java.util.List;

/**
 * Created by cluster on 2017/7/24.
 */
public class WordSegTest {
    public static void main(String[] args){
        List<Word> words = WordSegmenter.seg("杨尚川是APDPlat应用级产品开发平台的作者", SegmentationAlgorithm.BidirectionalMaximumMatching);

        PartOfSpeechTagging.process(words);
        System.out.print(words);
//        [杨尚川/i, apdplat/w, 应用级/i, 产品开发/l, 平台/n, 作者/n]
//        [杨尚川/nr, 是/vshi, APDPlat/nx, 应用/vn, 级/q, 产品开发/nz, 平台/n, 的/ude1, 作者/nnt]
    }
}
