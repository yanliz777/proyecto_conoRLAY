package co.edu.uniquindio.mapping.mappers;


import co.edu.uniquindio.mapping.dto.ProductoDto;
import co.edu.uniquindio.mapping.dto.VendedorDto;
import co.edu.uniquindio.model.Producto;
import co.edu.uniquindio.model.Vendedor;
import org.mapstruct.IterableMapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface SubastaMapper {

    SubastaMapper INSTANCE = Mappers.getMapper(SubastaMapper.class);

    @Named("productoToProductoDto")
    ProductoDto productoToProductoDto(Producto producto);

    //@Mappiing(target ="producto", source="productoToProductoDto")
    Producto productoDtoToProducto(ProductoDto productoDto);

    @IterableMapping(qualifiedByName = "productoToProductoDto")
    List<ProductoDto> getProductoDto(List<Producto> listaProductos);

    @Named("vendedorToVendedorDto")
    VendedorDto vendedorToVendedorDto(Vendedor vendedor);

    //@Mappiing(target ="vendedor", source="vendedorToVendedorDto")
    Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto);

    @IterableMapping(qualifiedByName = "vendedorToVendedorDto")
    List<VendedorDto> getVendedorDto(List<Vendedor> listaVendedores);
}
