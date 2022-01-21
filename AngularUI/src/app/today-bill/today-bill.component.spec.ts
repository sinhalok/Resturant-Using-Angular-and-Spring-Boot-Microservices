import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodayBillComponent } from './today-bill.component';

describe('TodayBillComponent', () => {
  let component: TodayBillComponent;
  let fixture: ComponentFixture<TodayBillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodayBillComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodayBillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
