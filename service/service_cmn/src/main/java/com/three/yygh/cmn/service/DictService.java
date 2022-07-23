package com.three.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.three.yygh.model.cmn.Dict;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author three
 * @date 2022-07-23 18:14
 */
public interface DictService extends IService<Dict> {
    List<Dict> findChildData(Long id);

    void exportData(HttpServletResponse response);

    void importData(MultipartFile file);
}
