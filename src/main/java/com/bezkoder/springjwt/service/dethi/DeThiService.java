package com.bezkoder.springjwt.service.dethi;

import com.bezkoder.springjwt.dtos.DethiDto;
import com.bezkoder.springjwt.models.Dethi;
import com.bezkoder.springjwt.repository.DethiRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DeThiService implements IDeThiService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DethiRepository dethiRepository;

    @Override
    public List<DethiDto> findAll() {
        // Gọi repo lấy từ db
        List<Dethi> dethis = dethiRepository.findAll();
        //Chuyển các entities thành các đối tượng Data Transfer Object(DTO) rồi trả về cho controller
        List<DethiDto> dethiDtos = dethis.stream().map(dethi -> modelMapper.map(dethi, DethiDto.class)).collect(Collectors.toList());
        return  dethiDtos;
    }

    @Override
    public Optional<DethiDto> findById(Integer id) {
        // Gọi repo lấy dữ liệu entity từ db
        Optional<Dethi> dethi = dethiRepository.findById(id);
        //Chuyển entity thành DTO rồi trả về cho controller:
        Optional<DethiDto> dethiDto = dethi.map(dethiitem -> modelMapper.map(dethiitem, DethiDto.class));
        return dethiDto;
    }

    @Override
    public DethiDto save(DethiDto dethiDto) {
        // Chuyển DTO thành entity
        Dethi dethi = modelMapper.map(dethiDto, Dethi.class);
        // Lưu xuống db và trả về đối tượng entity đã được cập nhật
        Dethi dethiSaved = dethiRepository.save(dethi);
        // Chuyển lại đối tượng entity đã được cập nhật sang DTO để trả về:
        return modelMapper.map(dethiSaved, DethiDto.class);
    }

    @Override
    public void remove(Integer id) {
        dethiRepository.deleteById(Long.valueOf(id));
    }
}
