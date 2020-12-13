package com.lin.missyou.service;

import com.lin.missyou.bo.PageCounter;
import com.lin.missyou.exception.http.NotFoundException;
import com.lin.missyou.model.Spu;
import com.lin.missyou.repository.SpuRepository;
import com.lin.missyou.util.CommonUtil;
import com.lin.missyou.vo.Paging;
import com.lin.missyou.vo.SpuSimplifyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpuService {
    @Autowired
    SpuRepository spuRepository;

    /**
     * 查询 spu 详情
     * @param id
     * @return
     */
    public Spu getSpu(Long id) {
        Spu spu = spuRepository.findOneById(id);
        if (spu == null) {
            throw new NotFoundException(30003);
        }
        return spu;
    }

    /**
     * 分页查询 spu 列表
     * @param start
     * @param count
     * @return
     */
    @SuppressWarnings("unchecked")
    public Paging<SpuSimplifyVO> getLatestPagingSpu(Integer start, Integer count) {
        int pageNum = start / count;
        Pageable page = PageRequest.of(pageNum, count, Sort.by("createTime").descending());
        Page<Spu> spuPage = spuRepository.findAll(page);

        List<Spu> spuList = spuPage.getContent();
        List<SpuSimplifyVO> spuSimplifyVOS = spuList.stream()
                .map(SpuSimplifyVO::new)
                .collect(Collectors.toList());

        Paging<SpuSimplifyVO> paging = new Paging(spuPage);
        paging.setItems(spuSimplifyVOS);
        return paging;
    }

    public Page<Spu> getByCategory(Long cid, Boolean isRoot, Integer pageNum, Integer size) {
        Pageable page = PageRequest.of(pageNum, size);
        Page<Spu> spuPage = null;
        if (isRoot) {
            return this.spuRepository.findByRootCategoryIdOrderByCreateTime(cid, page);
        }
        else {
            return this.spuRepository.findByRootCategoryIdOrderByCreateTime(cid, page);
        }
    }
}
