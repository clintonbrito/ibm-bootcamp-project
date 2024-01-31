import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category'
})
export class CategoryPipe implements PipeTransform {

  transform(value: string, ..._args: unknown[]): string {
    switch (value) {
      case 'food': return 'restaurant';
      case 'transport': return 'directions_bus';
      case 'health': return 'health_and_safety';
      case 'education': return 'school';
      case 'entertainment': return 'sports_esports';
    }
    return 'others';
  }

}
