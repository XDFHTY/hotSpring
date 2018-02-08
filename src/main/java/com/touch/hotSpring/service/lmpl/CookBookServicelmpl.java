package com.touch.hotSpring.service.lmpl;

import com.touch.hotSpring.service.CookBookService;
import org.springframework.stereotype.Service;

/**
 * description:
 * ===>菜单管理业务接口实现类,用于管理菜单各类数据查询，添加。
 *
 * @author duyuxiang Created on 2017-11-07 16:50
 * @version V1.0
 */
@SuppressWarnings("ALL")
@Service
public class CookBookServicelmpl implements CookBookService {

//    @Resource
//    private CookBookDao dao;
//    @Resource
//    private SqlSessionTemplate sqlSessionTemplate;
//    @Resource
//    private FileService fileService;
//    @Resource
//    private FileDao fileDao;
//    @Resource
//    private DeleteFileUtil deleteFile;
//    //实例化UUID工具类
//    private UUIDUtil uuid = UUIDUtil.getInstance();
//
//
//    /**
//     * 部门类别数据查询业务方法，用于前台下拉框或其他方式查询部门类别,
//     * 无分页
//     *
//     * @param <T>
//     * @return 查询数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryTypeService() throws Exception {
//        List<MenuTypeDO> data = this.dao.queryMenuTypeDao();
//        if (data.size() > 0) {
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 前台下拉框菜单小类数据过滤业务方法
//     *
//     * @param tid 菜单类型编号
//     * @param <T>
//     * @return 过滤数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryMenuStypeService(String tid) throws Exception {
//        List<MenuSubTypeDO> data = this.dao.queryMenuStypeByIdDao(tid);
//        if (data.size() > 0) {
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 查询菜单类型，用于前台点餐时大类的数据展示或添加菜单数据用于定位小类型业务方法
//     *
//     * @param <T>
//     * @return 查询数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryMenuTypeService(HotelDTO page) throws Exception {
//        Page<T> pages = PageHelper.startPage(page.getPage(), page.getTotal());
//        List<MenuTypeDO> list = this.dao.queryMenuTypeDao();
//        if (list.size() > 0) {
//            PageInfo<MenuTypeDO> data = new PageInfo<MenuTypeDO>(list);
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 查询菜品小类，用于前台点餐时小类的数据展示或添加菜单数据用于定位菜名业务方法
//     * 该方法下当查询小类为空时自动获取不存在小类的菜品
//     *
//     * @param tid  菜单类型编号
//     * @param page 参数信息
//     * @param <T>
//     * @return 查询数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryMenuStypeService(HotelDTO param) throws Exception {
//        Page<T> pages = PageHelper.startPage(param.getPage(), param.getTotal());
//        List<MenuSubTypeDO> list = this.dao.queryMenuSubtypeDao(param);
//        //存在小类时返回小类，否则自动获取部门类别下的菜品
//        if (list.size() > 0) {
//            PageInfo<MenuSubTypeDO> data = new PageInfo<>(list);
//            return (T) new Result(0, data);
//        }
//        param.setIsSub(1);
//        Page<Object> pages1 = PageHelper.startPage(param.getPage(), param.getTotal());
//        List<MenuDO> list1 = this.dao.queryMenuDetailDao(param);
//        if (list1.size() > 0) {
//            PageInfo<MenuDO> data = new PageInfo<MenuDO>(list1);
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 前台下拉框菜单或多选框数据查询业务方法
//     *
//     * @param stid 菜单字类型编号
//     * @param <T>
//     * @return 查询数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryMenuService(String stid, String tid) throws Exception {
//        List<Map> data = this.dao.queryMenuDao(stid, tid);
//        if (data.size() > 0) {
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 菜单数据查询，用于前台点餐时菜单数据的展示业务方法
//     *
//     * @param stid 类别编号
//     * @param tid  小类别编号
//     * @param page 分页数据
//     * @param <T>
//     * @return 查询数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryMenuDetailService(HotelDTO param, HttpServletRequest request) throws Exception {
//        Page<T> pages = PageHelper.startPage(param.getPage(), param.getTotal());
//        List<MenuDO> list = this.dao.queryMenuDetailDao(param);
//        int len = list.size();
//        if (len > 0) {
//            if (param.getSetFindFile() == 0) {
//                for (int i = 0; i < len; ++i) {
//                    List<String> picture = this.fileService.getFileDataServicelmpl(request, list.get(i).getId());
//                    list.get(i).setPicture(picture);
//                }
//            }
//            PageInfo<MenuDO> data = new PageInfo<MenuDO>(list);
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 菜单做法查询，用于前台点餐时做法数据展示或添加菜单数据用于定位做法详情业务方法
//     *
//     * @param cbid 菜单编号
//     * @param page 参数信息
//     * @param <T>
//     * @return 查询数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryMenuMeansService(HotelDTO param) throws Exception {
//        Page<T> pages = PageHelper.startPage(param.getPage(), param.getTotal());
//        List<MenuMeansDO> list = this.dao.queryMenuMeansDao(param);
//        if (list.size() > 0) {
//            PageInfo<MenuMeansDO> data = new PageInfo<MenuMeansDO>(list);
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 菜单做法详情查询，用于前台点餐时具体做法数据展示业务方法
//     *
//     * @param mid  做法编号
//     * @param page 参数信息
//     * @param <T>
//     * @return 查询数据
//     * @throws Exception
//     */
//    @Override
//    public <T> T queryMenuMeansDetailService(HotelDTO param) throws Exception {
//        Page<T> pages = PageHelper.startPage(param.getPage(), param.getTotal());
//        List<MenuMeansDetailDO> list = this.dao.queryMenuMeansDetailDao(param);
//        if (list.size() > 0) {
//            PageInfo<MenuMeansDetailDO> data = new PageInfo<MenuMeansDetailDO>(list);
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 餐饮套餐查询业务方法，用于前台点餐时具体获取套餐系列菜品以及获取套餐具体明细
//     *
//     * @param page 参数信息
//     * @param <T>
//     * @return 查询结果
//     * @throws Exception
//     */
//    @Override
//    public <T> T querySetMealService(HttpServletRequest request, HotelDTO param) throws Exception {
//        Page<T> pages = PageHelper.startPage(param.getPage(), param.getTotal());
//        List<SetMealDO> list = this.dao.querySetMealDao(param);
//        int len = list.size();
//        if (len > 0) {
//            for (int i = 0; i < len; ++i) {
//                List<SetMealDetailDO> detailList = this.dao.querySetMealDetailDao(list.get(i).getId());
//                int len1 = detailList.size();
//                if (param.getSetFindFile() == 0) {
//                    List<String> url = this.fileService.getFileDataServicelmpl(request, list.get(i).getFileId());
//                    list.get(i).setPicture(url);
//                    if (len1 > 0) {
//                        for (int j = 0; j < len1; ++j) {
//                            List<String> sturl = this.fileService.getFileDataServicelmpl(request, detailList.get(j).getFileId());
//                            detailList.get(j).setPicture(sturl);
//                        }
//                    }
//                }
//                if (len1 > 0) {
//                    list.get(i).setMealDetails(detailList);
//                }
//            }
//            PageInfo<SetMealDO> data = new PageInfo<SetMealDO>(list);
//            return (T) new Result(0, data);
//        }
//        return (T) new Status(StatusEnum.NO_DATA.getCODE(), StatusEnum.NO_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 检测添加套餐时是否存在相同套餐名
//     *
//     * @param sName 套餐名
//     * @return 套餐id
//     * @throws Exception
//     */
//    @Override
//    public String querySetMealByNameService(String sName) throws Exception {
//        return this.dao.querySetMealByNameDao(sName);
//    }
//
//
//    /**
//     * 菜单类别与小类数据添加
//     *
//     * @param msg1 菜单类别及小类数据
//     * @throws Exception
//     */
//    @Override
//    public void addMenuTypeService(MenuTypeDO msg) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            String id = this.dao.queryMenuTypeByNameDao(msg.gettName());
//            if (id == null) {
//                //设置菜单类别编号用于关联小类别表
//                id = this.uuid.getUUID("CY").toString();
//                msg.setId(id);
//                //类别数据添加
//                this.dao.addMenuTypeDao(msg);
//            }
//            if (msg.getMenuSubType() != null) {
//                int len = msg.getMenuSubType().size();
//                if (len > 0) {
//                    List<MenuSubTypeDO> msg1 = msg.getMenuSubType();
//                    for (int i = 0; i < len; ++i) {
//                        msg1.get(i).setId(this.uuid.getUUID("CY").toString());
//                        //设置小类别表关联类别表id
//                        msg1.get(i).setTid(id);
//                    }
//                    //小类别数据添加
//                    this.dao.addMenuSubtypeDao(msg1);
//                }
//            }
//            sqlSession.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            sqlSession.rollback();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//    }
//
//    /**
//     * 菜单数据、库存量数据添加
//     *
//     * @param msg 菜单数据及库存量数据
//     * @throws Exception
//     */
//    @Override
//    public Status addMenuService(MenuDTO msg) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao dao = sqlSession.getMapper(CookBookDao.class);
//        List<MenuDO> menu = msg.getMenu();
//        //获取类别编号用于关联类别表
//        String tid = msg.getTid();
//        //获取小类别编号用于关联小类别表
//        String stid = msg.getStid();
//        //设置菜单添加时间
//        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//        //设置库存量数据集合容器
//        List<InventoryDO> msg1 = new ArrayList<InventoryDO>();
//        for (int i = 0, len = menu.size(); i < len; ++i) {
//            //实例化库存量实体，用于设置菜单库存量数据
//            InventoryDO inv = new InventoryDO();
//            //设置菜单数据编号
//            String id = this.uuid.getUUID("CY").toString();
//            //文件上传
//            MultipartFile[] files = menu.get(i).getFiles();
//            if (files != null) {
//                int arg = this.fileService.fileUploadServicelmpl(files, "images", id);
//                switch (arg) {
//                    case 0:
//                        menu.get(i).setFileId(id);
//                        break;
//                    case 603:
//                        return new Status(StatusEnum.FILE_FORMAT.getCODE(), StatusEnum.FILE_FORMAT.getEXPLAIN());
//                    case 601:
//                        return new Status(StatusEnum.FILE_SIZE.getCODE(), StatusEnum.FILE_SIZE.getEXPLAIN());
//                }
//            }
//            menu.get(i).setId(id);
//            menu.get(i).setTid(tid);
//            menu.get(i).setStid(stid);
//            //设置关联菜单表id
//            inv.setId(id);
//            inv.setTid(tid);
//            inv.setStid(stid);
//            inv.setNum(menu.get(i).getNum());
//            inv.setDate(date);
//            msg1.add(inv);
//        }
//        try {
//            //库存量数据添加
//            dao.addInventoryDao(msg1);
//            //菜单数据添加
//            dao.addMenuDao(menu);
//            sqlSession.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            sqlSession.rollback();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//        return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//    }
//
//    /**
//     * 菜单做法数据添加
//     *
//     * @param msg 菜单做法数据
//     * @throws Exception
//     */
//    @Override
//    @Transactional
//    public void addMenuMeansService(MeansDTO msg) throws Exception {
//        String tid = msg.getTid();
//        String stid = msg.getStid();
//        String cbid = msg.getCbid();
//        List<MenuMeansDO> means = msg.getMeans();
//        for (int i = 0, len = means.size(); i < len; ++i) {
//            means.get(i).setId(this.uuid.getUUID("CY").toString());
//            means.get(i).setTid(tid);
//            means.get(i).setStid(stid);
//            //设置关联菜单表id
//            means.get(i).setCbid(cbid);
//        }
//        this.dao.addMenuMeansDao(means);
//    }
//
//    /**
//     * 菜单详细做法数据添加
//     *
//     * @param msg 菜单详细做法数据
//     * @throws Exception
//     */
//    @Transactional
//    @Override
//    public void addMenuMeansDetailService(MenuMeansDO msg) throws Exception {
//        if (msg != null) {
//            //获取做法编号用于关联详细做法，并移除集合中的做法编号
//            String mid = msg.getMdid();
//            String tid = msg.getTid();
//            String stid = msg.getStid();
//            String cbid = msg.getCbid();
//            List<MenuMeansDetailDO> mdt = msg.getMeansDetails();
//            for (int i = 0, len = mdt.size(); i < len; ++i) {
//                mdt.get(i).setId(this.uuid.getUUID("CY").toString());
//                //设置关联做法表id
//                mdt.get(i).setMid(mid);
//                mdt.get(i).setTid(tid);
//                mdt.get(i).setStid(stid);
//                mdt.get(i).setCbid(cbid);
//            }
//            this.dao.addMenuMeansDetailDao(mdt);
//        }
//    }
//
//    /**
//     * 套餐数据添加,包含有套餐明细数据
//     *
//     * @param msg 套餐数据
//     * @throws Exception
//     */
//    @Override
//    public Status addSetMealService(SetMealDO msg) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            String id = cbDao.querySetMealByNameDao(msg.getSmName());
//            List<SetMealDetailDO> mealDetails = msg.getMealDetails();
//            //套餐不存在 start
//            if (id == null) {
//                //设置套餐编号，用于关联套餐明细表
//                id = this.uuid.getUUID("CY").toString();
//                msg.setId(id);
//                //文件上传
//                MultipartFile[] files = msg.getFiles();
//                if (files != null) {
//                    int arg = this.fileService.fileUploadServicelmpl(files, "images", id);
//                    switch (arg) {
//                        case 0:
//                            msg.setFileId(id);
//                            break;
//                        case 603:
//                            return new Status(StatusEnum.FILE_FORMAT.getCODE(), StatusEnum.FILE_FORMAT.getEXPLAIN());
//                        case 601:
//                            return new Status(StatusEnum.FILE_SIZE.getCODE(), StatusEnum.FILE_SIZE.getEXPLAIN());
//                        default:
//                            break;
//                    }
//                }
//                for (int i = 0, len = mealDetails.size(); i < len; ++i) {
//                    mealDetails.get(i).setId(this.uuid.getUUID("CY").toString());
//                    //关联套餐编号
//                    mealDetails.get(i).setSmid(id);
//                }
//                //套餐数据添加
//                cbDao.addSetMealDao(msg);
//                //套餐不存在 end
//                //套餐存在 start
//            } else {
//                for (int i = 0, len = mealDetails.size(); i < len; ++i) {
//                    //检查套餐中是否存在相同菜品，存在时覆盖添加
//                    String cbid = cbDao.querySetMealDetailByNameDao(mealDetails.get(i).getCbid(), id, mealDetails.get(i).getTcSpec());
//                    if (cbid == null) {
//                        mealDetails.get(i).setId(this.uuid.getUUID("CY").toString());
//                        //关联套餐编号
//                        mealDetails.get(i).setSmid(id);
//                    } else {
//                        mealDetails.remove(i);
//                        --i;
//                        len = mealDetails.size();
//                        if (len == 0)
//                            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//                    }
//                }
//            }
//            //套餐存在 end
//            //套餐明细数据添加
//            cbDao.addSetMealDetailDao(mealDetails);
//            sqlSession.commit();
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        } catch (Exception e) {
//            e.printStackTrace();
//            sqlSession.rollback();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//    }
//
//    /**
//     * 现有套餐中增加菜品业务方法
//     *
//     * @param msg 增加菜品数据
//     * @throws Exception
//     */
//    @Override
//    public Status addSetMealDetailService(SetMealDO msg) throws Exception {
//        List<SetMealDetailDO> list = msg.getMealDetails();
//        if (list.size() > 0) {
//            this.dao.addSetMealDetailDao(msg.getMealDetails());
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        }
//        return new Status(StatusEnum.NO_PARAM_DATA.getCODE(), StatusEnum.NO_PARAM_DATA.getEXPLAIN());
//    }
//
//    /**
//     * 部门类别与小类更新
//     *
//     * @param msg 更新数据
//     * @return 更新结果
//     * @throws Exception
//     */
//    @Override
//    public Status updateMenuTypeService(MenuSubTypeDO msg) throws Exception {
//        int row = this.dao.updateMenuSubTypeDao(msg);
//        if (row > 0) {
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        }
//        return new Status(StatusEnum.UPDATE_DEFEAT.getCODE(), StatusEnum.UPDATE_DEFEAT.getEXPLAIN());
//        //下个版本实现
//        /*SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            if (msg.getMenuSubType() != null) {
//                List<MenuSubTypeDO> stype = msg.getMenuSubType();
//                int len = stype.size();
//                if (len > 0) {
//                    DatabasesDTO param = new DatabasesDTO();
//                    for (int i = 0; i < len; ++i) {
//                        cbDao.updateMenuSubTypeDao(stype.get(i));
//                        //设置需要更新数据id和字段
//                        param.setColumn("STID");
//                        param.setId(stype.get(i).getId());
//                        //设置需要更新的值
//                        param.setTid(stype.get(i).getTid());
//                        //更新菜品表
//                        param.setTable("gs_cookbook");
//                        cbDao.updateCookBookAllDao(param);
//                        //更新库存表
//                        param.setTable("gs_cookbook_inventory");
//                        cbDao.updateCookBookAllDao(param);
//                        //更新做法表
//                        param.setTable("gs_cookbook_means");
//                        cbDao.updateCookBookAllDao(param);
//                        //更新做法详情表
//                        param.setTable("gs_cookbook_means_detal");
//                        cbDao.updateCookBookAllDao(param);
//                        //更新套餐明细表
//                        param.setTable("gs_cookbook_setmeal_detalt");
//                        cbDao.updateCookBookAllDao(param);
//                    }
//                }
//            }
//            //暂时不用以后会用
//            //cbDao.updateMenuTypeDao(msg);
//        sqlSession.commit();
//    } catch(
//    Exception e)
//    {
//        sqlSession.rollback();
//        e.printStackTrace();
//        throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//    } finally
//
//    {
//        sqlSession.close();
//    }
//        return new Status(StatusEnum.SUCCESS.getCODE(),StatusEnum.SUCCESS.getEXPLAIN());*/
//    }
//
//    /**
//     * 菜品及库存量数据更新
//     *
//     * @param msg 更新数据
//     * @return 更新结果
//     * @throws Exception
//     */
//    @Override
//    @Transactional
//    public Status updateMenuService(MenuDO msg) throws Exception {
//        String tid = msg.getTid();
//        String stid = msg.getStid();
//        InventoryDO inv = new InventoryDO();
//        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//        DatabasesDTO param = new DatabasesDTO();
//        //文件上传
//        MultipartFile[] files = msg.getFiles();
//        if (files != null) {
//            String newFileId = this.uuid.getUUID("CY").toString();
//            String fileId = msg.getFileId();
//            int arg = this.fileService.fileUploadServicelmpl(files, "images", newFileId);
//            switch (arg) {
//                //存在文件更新则获取旧文件
//                case 0:
//                    if (fileId != null && !("".equals(fileId))) {
//                        //异步处理删除数据文件，不影响业务流的完成
//                        try {
//                            List<FileData> list = this.fileDao.queryFileDao(fileId);
//                            //删除硬盘上的旧文件
//                            this.deleteFile.deleteNAllFile(list);
//                            //删除数据库旧文件存档数据
//                            this.fileDao.deleteFileDao(fileId);
//                        } catch (Exception e) {
//                            System.out.println(e.toString());
//                        }
//                    }
//                    msg.setFileId(newFileId);
//                    break;
//                case 603:
//                    return new Status(StatusEnum.FILE_FORMAT.getCODE(), StatusEnum.FILE_FORMAT.getEXPLAIN());
//                case 601:
//                    return new Status(StatusEnum.FILE_SIZE.getCODE(), StatusEnum.FILE_SIZE.getEXPLAIN());
//                default:
//                    break;
//            }
//        }
//        inv.setId(msg.getId());
//        inv.setTid(tid);
//        inv.setStid(stid);
//        inv.setNum(msg.getNum());
//        inv.setDate(date);
//        this.dao.updateMenuDao(msg);
//        this.dao.updateInventoryDao(inv);
//        return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//    }
//
//    /**
//     * 菜品做法数据更新
//     *
//     * @param msg 更新数据
//     * @return 更新结果
//     * @throws Exception
//     */
//    @Override
//    @Transactional
//    public Status updateMenuMeansService(MenuMeansDO msg) throws Exception {
//        int row = this.dao.updateMenuMeansDao(msg);
//        if (row > 0) {
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        }
//        return new Status(StatusEnum.UPDATE_DEFEAT.getCODE(), StatusEnum.UPDATE_DEFEAT.getEXPLAIN());
//        //下个版本可能需要使用
//        /*SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        DatabasesDTO param = new DatabasesDTO();
//        try {
//            //设置更新数据id
//            param.setId(msg.getId());
//            //设置更新数据值
//            param.setTid(msg.getTid());
//            param.setStid(msg.getStid());
//            param.setCbid(msg.getCbid());
//            //设置更新数据字段
//            param.setColumn("MID");
//            //做法明细更新
//            param.setTable("gs_cookbook_means_detal");
//            cbDao.updateCookBookAllDao(param);
//            cbDao.updateMenuMeansDao(msg);
//            sqlSession.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            sqlSession.rollback();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//        return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());*/
//    }
//
//    /**
//     * 菜品做法数据更新
//     *
//     * @param msg 更新数据
//     * @return 更新结果
//     * @throws Exception
//     */
//    @Override
//    @Transactional
//    public Status updateMenuMeansDetailService(MenuMeansDetailDO msg) throws Exception {
//        int row = this.dao.updateMenuMeansDetailDao(msg);
//        if (row > 0) {
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        }
//        return new Status(StatusEnum.UPDATE_DEFEAT.getCODE(), StatusEnum.UPDATE_DEFEAT.getEXPLAIN());
//    }
//
//    @Override
//    public Status updateSetMealService(SetMealDO msg) throws Exception {
//        return null;
//    }
//
//    /**
//     * 删除部门类别业务方法
//     *
//     * @param id 数据编号
//     * @return 删除结果
//     * @throws Exception
//     */
//    @Override
//    public Status deleteMenuTypeService(String... id) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            //删除部门类别数据同时删除该部门类别数据下所有相关联的数据
//            cbDao.deleteMenuTypeDao(id);
//            //小类数据
//            cbDao.deleteMenuSubTypeDao(id, 1);
//            //菜品数据
//            cbDao.deleteMenuDao(id, 1);
//            //菜品做法数据
//            cbDao.deleteMenuMeansDao(id, 1);
//            //菜品明细做法数据
//            cbDao.deleteMenuMeansDetailDao(id, 1);
//            //套餐明细数据
//            cbDao.deleteSetMealDetailDao(id, 10);
//            sqlSession.commit();
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        } catch (Exception e) {
//            sqlSession.rollback();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//    }
//
//    /**
//     * 删除小类业务方法
//     *
//     * @param id 数据id
//     * @return 删除结果
//     * @throws Exception
//     */
//    @Override
//    public Status deleteMenuSubTypeService(String... id) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            //删除小类数据同时删除该小类下所有相关联数据
//            cbDao.deleteMenuSubTypeDao(id, 0);
//            //菜品数据
//            cbDao.deleteMenuDao(id, 2);
//            //菜品做法数据
//            cbDao.deleteMenuMeansDao(id, 2);
//            //菜品做法明细数据
//            cbDao.deleteMenuMeansDetailDao(id, 2);
//            //套餐明细数据
//            cbDao.deleteSetMealDetailDao(id, 11);
//            sqlSession.commit();
//        } catch (Exception e) {
//            sqlSession.rollback();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//        return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//
//    }
//
//    /**
//     * 删除菜品数据业务方法
//     *
//     * @param id 数据编号
//     * @return 删除结果
//     * @throws Exception
//     */
//    @Override
//    public Status deleteMenuService(String[] id, String[] fileId) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            //删除菜品数据同时删除该菜品下关联的所有数据
//            cbDao.deleteMenuDao(id, 0);
//            //做法数据
//            cbDao.deleteMenuMeansDao(id, 3);
//            //明细做法数据
//            cbDao.deleteMenuMeansDetailDao(id, 3);
//            //套餐明细数据
//            cbDao.deleteSetMealDetailDao(id, 12);
//            sqlSession.commit();
//        } catch (Exception e) {
//            sqlSession.rollback();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//        //异步处理删除数据文件，不影响业务流的完成
//        try {
//            if (fileId != null) {
//                int len = fileId.length;
//                if (len > 0) {
//                    for (int i = 0; i < len; ++i) {
//                        List<FileData> list = this.fileDao.queryFileDao(fileId[i]);
//                        //删除硬盘上的旧文件
//                        this.deleteFile.deleteNAllFile(list);
//                    }
//                    //删除数据库旧文件存档数据
//                    this.fileDao.deleteFileDao(fileId);
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//        return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//    }
//
//    /**
//     * 删除菜品做法业务方法
//     *
//     * @param id 数据编号
//     * @return 删除结果
//     * @throws Exception
//     */
//    @Override
//    public Status deleteMenuMeansService(String... id) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            //删除菜品做法数据同时删除该做法下所有相关数据
//            cbDao.deleteMenuMeansDao(id, 0);
//            cbDao.deleteMenuMeansDetailDao(id, 4);
//            sqlSession.commit();
//        } catch (Exception e) {
//            sqlSession.rollback();
//            e.printStackTrace();
//            throw new HotelDataBaseException(StatusEnum.UPDATE_DEFEAT.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//        return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//    }
//
//    /**
//     * 删除菜品明细做法业务方法
//     *
//     * @param id 数据编号
//     * @return 删除结果
//     * @throws Exception
//     */
//    @Transactional
//    @Override
//    public Status deleteMenuMeansDetailService(String... id) throws Exception {
//        int row = this.dao.deleteMenuMeansDetailDao(id, 0);
//        if (row > 0) {
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        }
//        return new Status(StatusEnum.DELETE_DEFEAT.getCODE(), StatusEnum.DELETE_DEFEAT.getEXPLAIN());
//    }
//
//    /**
//     * 删除套餐数据业务方法
//     *
//     * @param id 数据编号
//     * @return 删除结果
//     * @throws Exception
//     */
//    @Override
//    public Status deleteSetMealService(String[] id, String[] fileId) throws HotelDataBaseException {
//        SqlSession sqlSession = this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH);
//        CookBookDao cbDao = sqlSession.getMapper(CookBookDao.class);
//        try {
//            //删除套餐数据同时删除与此套餐相关联数据
//            cbDao.deleteSetMealDao(id);
//            cbDao.deleteSetMealDetailDao(id, 1);
//            sqlSession.commit();
//        } catch (Exception e) {
//            sqlSession.rollback();
//            e.printStackTrace();
//            throw new HotelDataBaseException(StatusEnum.DATABASE_ERROR.getEXPLAIN());
//        } finally {
//            sqlSession.close();
//        }
//        //异步处理删除数据文件，不影响业务流的完成
//        try {
//            if (fileId != null) {
//                int len = fileId.length;
//                if (len > 0) {
//                    for (int i = 0; i < len; ++i) {
//                        List<FileData> list = this.fileDao.queryFileDao(fileId[i]);
//                        //删除硬盘上的旧文件
//                        this.deleteFile.deleteNAllFile(list);
//                    }
//                    //删除数据库旧文件存档数据
//                    this.fileDao.deleteFileDao(fileId);
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//        return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//    }
//
//    /**
//     * 删除套餐明细数据业务方法
//     *
//     * @param id 数据编号
//     * @return 删除结果
//     * @throws Exception
//     */
//    @Transactional
//    @Override
//    public Status deleteSetMealDetailService(String... id) throws Exception {
//        int row = this.dao.deleteSetMealDetailDao(id, 0);
//        if (row > 0) {
//            return new Status(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN());
//        }
//        return new Status(StatusEnum.DELETE_DEFEAT.getCODE(), StatusEnum.DELETE_DEFEAT.getEXPLAIN());
//    }

}
