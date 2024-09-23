@extends('admin.layout.master')

@section('content')
    <div class="container-fluid">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title fw-semibold mb-4">Danh mục</h5>
                <form method="POST" action="{{route('category.update', $category)}}" enctype="multipart/form-data">
                    @csrf
                    <div class="mb-3">
                        <label for="name" class="form-label">Tên</label>
                        <input type="text" name="name" value="{{$category->name}}" class="form-control" id="name">
                    </div>
                    <div class="mb-3">
                        <label for="image" class="form-label">Ảnh</label>
                        <input type="file" name="image" class="form-control" id="image" accept="image/*">
                        <div class="mt-4">
                            <img src="{{Storage::url($category->image)}}" alt="" width="80">
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">Cập nhật</button>
                </form>
            </div>
        </div>
    </div>
@endsection