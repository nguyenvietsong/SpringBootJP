package com.bezkoder.springjwt.service.trinhdo;

import com.bezkoder.springjwt.dtos.TrinhDoDto;
import com.bezkoder.springjwt.models.TrinhDo;
import com.bezkoder.springjwt.repository.TrinhdoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrinhDoService implements ITrinhDoService {
    @Autowired
    private TrinhdoRepository trinhdoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TrinhDoDto> findAll() {
        // Gọi repo lấy từ db
        List<TrinhDo> trinhDos = trinhdoRepository.findAll();
        //Chuyển các entities thành các đối tượng Data Transfer Object(DTO) rồi trả về cho controller
        List<TrinhDoDto> trinhDoDtos = trinhDos.stream().map(trinhDo -> modelMapper.map(trinhDo, TrinhDoDto.class)).collect(Collectors.toList());
        return trinhDoDtos;
    }

    @Override
    public Optional<TrinhDoDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public TrinhDoDto save(TrinhDoDto trinhDoDto) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
