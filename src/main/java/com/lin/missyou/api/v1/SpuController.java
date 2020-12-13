package com.lin.missyou.api.v1;

import com.lin.missyou.model.Spu;
import com.lin.missyou.service.SpuService;
import com.lin.missyou.vo.Paging;
import com.lin.missyou.vo.SpuSimplifyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/spu")
@Validated
public class SpuController {
    @Autowired
    private SpuService spuService;

    /**
     * 查询 spu 详情
     * @param id
     * @return
     */
    @GetMapping("/id/{id}/detail")
    public Spu getDetail(@PathVariable @Positive(message = "{id.positive}") Long id) {
        return spuService.getSpu(id);
    }

    /**
     * 分页查询 spu 列表
     * @param start
     * @param count
     * @return
     */
    @GetMapping("/latest")
    public Paging<SpuSimplifyVO> getLatestSpuList(@RequestParam(defaultValue = "0") Integer start,
                                                  @RequestParam(defaultValue = "20") Integer count) {
        return spuService.getLatestPagingSpu(start, count);
    }

//    @GetMapping("/by/category/{id}")
//    public PagingDozer<Spu, SpuSimplifyVO> getByCategoryId(@PathVariable @Positive Long id,
//                                                           @RequestParam(name = "is_root", defaultValue = "false") Boolean isRoot,
//                                                           @RequestParam(defaultValue = "0")
//                                                                       Integer start,
//                                                           @RequestParam(defaultValue = "10")
//                                                                       Integer count) {
//        PageCounter pageCounter = CommonUtil.convertToPageParameter(start, count);
//        Page<Spu> page = this.spuService.getByCategory(id, isRoot, pageCounter.getPage(), pageCounter.getCount());
//        return new PagingDozer<>(page, SpuSimplifyVO.class);
//    }
}
