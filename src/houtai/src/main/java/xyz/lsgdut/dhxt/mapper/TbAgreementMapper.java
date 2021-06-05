package xyz.lsgdut.dhxt.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.TbAgreement;
import xyz.lsgdut.dhxt.pojo.TbAgreementExample;

public interface TbAgreementMapper {
    long countByExample(TbAgreementExample example);

    int deleteByExample(TbAgreementExample example);

    int deleteByPrimaryKey(Integer agreementId);

    int insert(TbAgreement record);

    int insertSelective(TbAgreement record);

    List<TbAgreement> selectByExampleWithBLOBs(TbAgreementExample example);

    List<TbAgreement> selectByExample(TbAgreementExample example);

    TbAgreement selectByPrimaryKey(Integer agreementId);

    int updateByExampleSelective(@Param("record") TbAgreement record, @Param("example") TbAgreementExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAgreement record, @Param("example") TbAgreementExample example);

    int updateByExample(@Param("record") TbAgreement record, @Param("example") TbAgreementExample example);

    int updateByPrimaryKeySelective(TbAgreement record);

    int updateByPrimaryKeyWithBLOBs(TbAgreement record);

    int updateByPrimaryKey(TbAgreement record);
}